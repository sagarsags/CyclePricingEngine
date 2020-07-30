package learn.cycle;

import java.io.FileReader;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import learn.cycle.componentspecification.ChainAssemblySpecification;
import learn.cycle.componentspecification.FrameSpecification;
import learn.cycle.componentspecification.HandleBarSpecification;
import learn.cycle.componentspecification.SeatingSpecification;
import learn.cycle.componentspecification.WheelSpecification;
import learn.cycle.costcalculation.TotalCostCalculation;

public class CycleCostCalculationEngine {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 		*****Welcome Cycle Bazar*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly Provide Following Specification to get you good cycle" + " and its cost");
		System.out.println("Enter the year of buying the Cycle");
		int year=sc.nextInt();
		System.out.println(
				" 1. Do you want to provide Specification through Json Format  or 2. Command Line Interaction Format ?");
		System.out.println(" Choose option 1 for Json format and 2 for commond line format");
		int formatOption = sc.nextInt();
		// Specification class initialization

		int sameSpecification = 0;
		int cycleCost = 0;
		if (formatOption == 2) {
			System.out.println("Number of Cycle want to buy ?");
			int numberOfCycles = sc.nextInt();
			if (numberOfCycles >= 2) {
				System.out.println("Do you want same specification for cycle? provide 1 for  yes or 2 for no");
				sameSpecification = sc.nextInt();
			}
			if (sameSpecification == 1) {
				cycleCost = userFriendlyStatementDisplay(numberOfCycles,year);
				System.out
						.println("Total Cost For " + numberOfCycles + " Cycle  is = RS. " + cycleCost * numberOfCycles);
			} else {
				for (int i = 1; i <= numberOfCycles; i++) {
					int individualCost = userFriendlyStatementDisplay(numberOfCycles,year);
					cycleCost += individualCost;
				}
				System.out.println("Total Cycle Cost with = RS. " + cycleCost);
			}

		} else if (formatOption == 1) {
			WheelSpecification ws = new WheelSpecification();
			FrameSpecification fs = new FrameSpecification();
			ChainAssemblySpecification cs = new ChainAssemblySpecification();
			HandleBarSpecification hs = new HandleBarSpecification();
			SeatingSpecification ss = new SeatingSpecification();
			JSONParser parser = new JSONParser();
			try {
				Object obj = parser.parse(new FileReader("resource/cyclebuy.json"));
				JSONObject ja = new JSONObject(obj.toString());
				JSONObject getJsonData = ja.getJSONObject("JsonData");
				JSONArray cycleArray = getJsonData.getJSONArray("Cycle");
				int totalCycleCost = 0;
				// setting wheel specification
				for (int i = 0; i < cycleArray.length(); i++) {
					JSONObject jsonObject = (JSONObject) cycleArray.getJSONObject(i);
					JSONObject wheelObj = jsonObject.getJSONObject("Wheel");
					JSONObject spokes = (JSONObject) wheelObj.get("Spokes");
					JSONObject tube = (JSONObject) wheelObj.get("Tube");
					JSONObject rim = (JSONObject) wheelObj.get("Rim");
					JSONObject tyre = (JSONObject) wheelObj.get("Tyre");
					ws.setTyre(twoOptionSelected(tyre, "Branded", "NonBranded"));
					ws.setSpokes(twoOptionSelected(spokes, "SingleRider", "DoubleRider"));
					ws.setTube(twoOptionSelected(tube, "WithTube", "TubeLess"));
					ws.setRim(twoOptionSelected(rim, "WithTube", "TubeLess"));

					// setting chain specification
					JSONObject chainAssemblyObj = jsonObject.getJSONObject("ChainAssembly");
					JSONObject chainAssemblyGear = chainAssemblyObj.getJSONObject("Gear");
					JSONObject chainAssemblyMaterial = chainAssemblyObj.getJSONObject("ChainMaterial");
					cs.setChainGear(threeOptionSelected(chainAssemblyGear, "4Gear", "5Gear", "NoGear"));
					cs.setChainMaterial(threeOptionSelected(chainAssemblyMaterial, "Steel", "Aluminimum", "Titanium"));

					// setting frame specification
					JSONObject frameObj = jsonObject.getJSONObject("Frame");
					JSONObject frameSize = frameObj.getJSONObject("FrameSize");
					JSONObject frameMaterial = frameObj.getJSONObject("FrameMaterial");
					fs.setFrameSize(threeOptionSelected(frameSize, "Small", "Medium", "Large"));
					fs.setFrameMaterials(threeOptionSelected(frameMaterial, "Steel", "Aluminimum", "Titanium"));

					// setting Handle bar specification
					JSONObject handleBar = jsonObject.getJSONObject("HandleBar");
					JSONObject handleBarType = handleBar.getJSONObject("HandleBarType");
					JSONObject handleBarMaterial = handleBar.getJSONObject("HandleBarMaterial");
					JSONObject handleBarCover = handleBar.getJSONObject("HandleBarCover");
					hs.setHandleBarType(threeOptionSelected(handleBarType, "Drop", "Standard", "Flat"));
					hs.setHandleBarMaterial(threeOptionSelected(handleBarMaterial, "Steel", "Aluminimum", "Titanium"));
					hs.setHandleBarCovering(threeOptionSelected(handleBarCover, "Tape", "Grips", "BarEnds"));

					// setting seating specification
					JSONObject seatingObj = jsonObject.getJSONObject("Seating");
					JSONObject seatingCapacity = seatingObj.getJSONObject("SeatingCapacity");
					JSONObject seatingCover = seatingObj.getJSONObject("SeatingCover");
					ss.setSeatingCapacity(twoOptionSelected(seatingCapacity, "SingleSeating", "DualSeating"));
					ss.setSeatCover(twoOptionSelected(seatingCover, "NonBranded", "Branded"));
					TotalCostCalculation tcc = new TotalCostCalculation();
					int singleCycleCost = 0;
					if (cycleArray.length() == 1) {
						System.out.println("Cycle Details --------------*********-----------");
						System.out.println(
								"Total Cycle Cost with Json Format = RS. " + tcc.totalCostCalculation(ws, fs, hs, cs, ss,year));
					} else {
						System.out.println("Cycle Details --------------*********-----------");
						singleCycleCost = tcc.totalCostCalculation(ws, fs, hs, cs, ss,year);
						System.out.println("Cost of individual cycle with Json Format = RS. " + singleCycleCost);
						totalCycleCost += singleCycleCost;
					}
				}
				if(totalCycleCost >0)
				{
        				System.out.println("Total Cycle Cost with Json Format = RS. " + totalCycleCost);
				}
			}

			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		System.out.println("Thanks for Buying " + " Happy Ridding !!!!!");
	}

	private static int userFriendlyStatementDisplay(int numberOfCycles,int year) {
		Scanner sc = new Scanner(System.in);
		// Specification class initialization
		WheelSpecification ws = new WheelSpecification();
		FrameSpecification fs = new FrameSpecification();
		ChainAssemblySpecification cs = new ChainAssemblySpecification();
		HandleBarSpecification hs = new HandleBarSpecification();
		SeatingSpecification ss = new SeatingSpecification();
		System.out.println("Wheel Specification");
		System.out.println("Spokes -> Select 1 or 2");
		System.out.println("Option Available Are :");
		System.out.println("1. Single Rider" + "," + "2. Double Rider");

		int spokeOptionSelected = sc.nextInt();
		System.out.println("Tube -> Select 1 or 2");
		System.out.println("Option Available Are :");
		System.out.println("1. WithTube" + "," + "2. TubeLess");
		int tubeOptionSelected = sc.nextInt();
		System.out.println("Tyre -> Select 1 or 2");
		System.out.println("Option Available Are :");
		System.out.println("1. Branded" + "," + "2. Non-Branded");
		int tyreOptionSelected = sc.nextInt();
		System.out.println("Rim -> Select 1 or 2");
		System.out.println("Option Available Are :");
		System.out.println("1. WithTube" + "," + "2. TubeLess");
		int rimOptionSelected = sc.nextInt();

		ws.setRim(rimOptionSelected);
		ws.setSpokes(spokeOptionSelected);
		ws.setTube(tubeOptionSelected);
		ws.setTyre(tyreOptionSelected);

		System.out.println("Frame Specification");
		System.out.println("Frame Size -> Select 1, 2 or 3");
		System.out.println("Option Available Are :");
		System.out.println("1. Small" + "," + "2. Medium" + "," + "3. Large");
		int frameSizeOptionSelected = sc.nextInt();
		System.out.println("Frame Material -> Select 1, 2 or 3");
		System.out.println("Option Available Are :");
		System.out.println("1. Steel" + "," + "2. Aluminimum" + "," + "3. Titanium");
		int frameMaterialOptionSelected = sc.nextInt();

		fs.setFrameMaterials(frameMaterialOptionSelected);
		fs.setFrameSize(frameSizeOptionSelected);

		System.out.println("Chain Assembly  Specification");
		System.out.println("Chain Material -> Select 1, 2 or 3");
		System.out.println("Option Available Are :");
		System.out.println("1. Steel" + "," + "2. Aluminimum" + "," + "3. Titanium");
		int chainMaterialOptionSelected = sc.nextInt();
		System.out.println("Gear -> Select  1 , 2 and 0 for no gear");
		System.out.println("Option Available Are :");
		System.out.println("1. 4 Gear" + "," + "2. 5 Gear " + "," + "0. No Gear");
		int chainGearOptionSelected = sc.nextInt();

		cs.setChainGear(chainGearOptionSelected);
		cs.setChainMaterial(chainMaterialOptionSelected);

		System.out.println("HandleBar Specification");
		System.out.println("Handle Bar Material -> Select 1, 2 or 3");
		System.out.println("Option Available Are :");
		System.out.println("1. Steel" + "," + "2. Aluminimum" + "," + "3. Titanium");
		int handleBarMaterialOptionSelected = sc.nextInt();
		System.out.println("Handle Bar Type -> Select 1, 2 or 3");
		System.out.println("Option Available Are :");
		System.out.println("1. Drop" + "," + "2. Standard" + "," + "3. Flat");
		int handleBarTypeOptionSelected = sc.nextInt();
		System.out.println("Handle Bar Cover -> Select 1, 2 or 3");
		System.out.println("Option Available Are :");
		System.out.println("1. Tape" + "," + "2. Grips" + "," + "3. Bar Ends");
		int handleBarCoverOptionSelected = sc.nextInt();

		hs.setHandleBarCovering(handleBarCoverOptionSelected);
		hs.setHandleBarMaterial(handleBarMaterialOptionSelected);
		hs.setHandleBarType(handleBarTypeOptionSelected);

		System.out.println("Seating Specification");
		System.out.println("Seating Capacity -> Select 1 or 2");
		System.out.println("Option Available Are :");
		System.out.println("1. Single Seating" + "," + "2. Dual Seating");
		int seatingCapacityOptionSelected = sc.nextInt();
		System.out.println("Seating Cover -> Select 1 or 2");
		System.out.println("Option Available Are :");
		System.out.println("1.Non Branded" + "," + "2.Branded");
		int seatingCoverOptionSelected = sc.nextInt();
		ss.setSeatCover(seatingCoverOptionSelected);
		ss.setSeatingCapacity(seatingCapacityOptionSelected);
		int singleCycleCost = 0;
		TotalCostCalculation tcc = new TotalCostCalculation();
		System.out.println("Cycle Details --------------*********-----------");
		singleCycleCost = tcc.totalCostCalculation(ws, fs, hs, cs, ss,year);
		if (numberOfCycles >= 2) {
			System.out.println("Single Cycle cost with given specification  = " + singleCycleCost);
		}
		return singleCycleCost;
	}

	private static int threeOptionSelected(JSONObject t, String str1, String str2, String str3) {
		// TODO Auto-generated method stub
		int result = 0;
		if ((t.get(str1).equals("Yes")) && (t.get(str2).equals("No")) && (t.get(str3).equals("No"))) {
			result = 1;
		} else if ((t.get(str1).equals("No")) && (t.get(str2).equals("Yes")) && (t.get(str3).equals("No"))) {
			result = 2;
		} else if ((t.get(str1).equals("No")) && (t.get(str2).equals("No")) && (t.get(str3).equals("Yes"))) {
			result = 3;
		}
		return result;
	}

	public static int twoOptionSelected(JSONObject t, String s, String d) {
		// TODO Auto-generated method stub
		int result = 0;
		if ((t.get(s).equals("Yes")) && (t.get(d).equals("No"))) {
			result = 1;
		} else if ((t.get(s).equals("No")) && (t.get(d).equals("Yes"))) {
			result = 2;
		}

		return result;

	}
}
