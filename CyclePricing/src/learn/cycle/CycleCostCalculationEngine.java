package learn.cycle;

import java.util.Scanner;

import learn.cycle.componentspecification.FrameSpecification;
import learn.cycle.componentspecification.WheelSpecification;
import learn.cycle.conversion.WheelConversion;
import learn.cycle.costcalculation.FrameCostCalculation;
import learn.cycle.costcalculation.WheelCostCalculation;

public class CycleCostCalculationEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
      System.out.println(" Welcome Cycle Bazar");
      System.out.println("Kindly Provide Following Specification to get you good cycle"
      		+ "and its cost");
      System.out.println("Wheel Specification");
      System.out.println("Spokes -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. Single Rider"+","+"2. Double Rider");
      Scanner sc=new Scanner(System.in);
      int spokeOptionSelected=sc.nextInt();
      System.out.println("Tube -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. WithTube"+","+"2. TubeLess");
      int tubeOptionSelected=sc.nextInt();
      System.out.println("Tyre -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. Branded"+","+"2. Non-Branded");
      int tyreOptionSelected=sc.nextInt();
      System.out.println("Rim -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. WithTube"+","+"2. TubeLess");
      int rimOptionSelected=sc.nextInt();
      WheelSpecification ws=new WheelSpecification();
      ws.setRim(rimOptionSelected);
      ws.setSpokes(spokeOptionSelected);
      ws.setTube(tubeOptionSelected);
      ws.setTyre(tyreOptionSelected);
      WheelCostCalculation wc=new WheelCostCalculation();
      wc.getRimCost(ws);
      wc.getSpokesCost(ws);
      wc.getTubeCost(ws);
      wc.getTyreCost(ws);
      System.out.println("Total Cost For Wheel= "+wc.getWheelTotalCost());
      System.out.println("Frame Specification");
      System.out.println("Frame Size -> Select 1, 2 or 3");
      System.out.println("Option Available Are :");
      System.out.println("1. Small"+","+"2. Medium"+","+"3. Large");
      int frameSizeOptionSelected=sc.nextInt();
      System.out.println("Frame Material -> Select 1, 2 or 3");
      System.out.println("Option Available Are :");
      System.out.println("1. Steel"+","+"2. Aluminimum"+","+"3. Titanium");
      int frameMaterialOptionSelected=sc.nextInt();
      FrameSpecification fs=new FrameSpecification();
      fs.setFrameMaterials(frameMaterialOptionSelected);
      fs.setFrameSize(frameSizeOptionSelected);
      FrameCostCalculation fc=new FrameCostCalculation();
      fc.getFrameSizeCost(fs);
      fc.getFrameMaterialCost(fs);
      System.out.println("Total Cost Frame "+fc.getTotalFrameCost());
      int cycleCost= fc.getTotalFrameCost()+wc.getWheelTotalCost();
      System.out.println("Total Cycle Cost As of Now "+cycleCost );
	}

	

	
	
	}


