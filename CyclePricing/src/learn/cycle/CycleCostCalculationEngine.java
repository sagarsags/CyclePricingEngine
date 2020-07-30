package learn.cycle;

import java.util.Scanner;

import learn.cycle.componentspecification.ChainAssemblySpecification;
import learn.cycle.componentspecification.FrameSpecification;
import learn.cycle.componentspecification.HandleBarSpecification;
import learn.cycle.componentspecification.SeatingSpecification;
import learn.cycle.componentspecification.WheelSpecification;
import learn.cycle.costcalculation.ChainAssemblyCostCalculation;
import learn.cycle.costcalculation.FrameCostCalculation;
import learn.cycle.costcalculation.HandleBarCostCalculation;
import learn.cycle.costcalculation.SeatingCostCalculation;
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
      System.out.println("Chain Assembly  Specification");
      System.out.println("Chain Material -> Select 1, 2 or 3");
      System.out.println("Option Available Are :");
      System.out.println("1. Steel"+","+"2. Aluminimum"+","+"3. Titanium");
      int chainMaterialOptionSelected=sc.nextInt();
      System.out.println("Gear -> Select  1 , 2 and 0 for no gear");
      System.out.println("Option Available Are :");
      System.out.println("1. 4 Gear"+","+"2. 5 Gear "+","+"0. No Gear");
      int chainGearOptionSelected=sc.nextInt();
      ChainAssemblySpecification cs=new ChainAssemblySpecification();
      cs.setChainGear(chainGearOptionSelected);
      cs.setChainMaterial(chainMaterialOptionSelected);
      ChainAssemblyCostCalculation cc=new ChainAssemblyCostCalculation();
      cc.getGearCost(cs);
      cc.getchainMaterialCost(cs);
      System.out.println("HandleBar Specification");
      System.out.println("Handle Bar Material -> Select 1, 2 or 3");
      System.out.println("Option Available Are :");
      System.out.println("1. Steel"+","+"2. Aluminimum"+","+"3. Titanium");
      int handleBarMaterialOptionSelected=sc.nextInt();
      System.out.println("Handle Bar Type -> Select 1, 2 or 3");
      System.out.println("Option Available Are :");
      System.out.println("1. Drop"+","+"2. Standard"+","+"3. Flat");
      int handleBarTypeOptionSelected=sc.nextInt();
      System.out.println("Handle Bar Cover -> Select 1, 2 or 3");
      System.out.println("Option Available Are :");
      System.out.println("1. Tape"+","+"2. Grips"+","+"3. Bar Ends");
      int handleBarCoverOptionSelected=sc.nextInt();
      HandleBarSpecification hs=new HandleBarSpecification();
      hs.setHandleBarCovering(handleBarCoverOptionSelected);
      hs.setHandleBarMaterial(handleBarMaterialOptionSelected);
      hs.setHandleBarType(handleBarTypeOptionSelected);
      HandleBarCostCalculation hc=new HandleBarCostCalculation();
      hc.getHandleBarCoveringCost(hs);
      hc.getHandleBarMaterialCost(hs);
      hc.getHandleBarTypeCost(hs);
      System.out.println("Seating Specification");
      System.out.println("Seating Capacity -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. Single Seating"+","+"2. Dual Seating");
      int seatingCapacityOptionSelected=sc.nextInt();
      System.out.println("Seating Cover -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1.Branded"+","+"2.Non Branded");
      int seatingCoverOptionSelected=sc.nextInt();
      SeatingSpecification ss=new SeatingSpecification();
      ss.setSeatCover(seatingCoverOptionSelected);
      ss.setSeatingCapacity(seatingCapacityOptionSelected);
      SeatingCostCalculation scc=new SeatingCostCalculation();
      scc.getSeatingCapacityCost(ss);
      scc.getSeatingCoverCost(ss);
      
      System.out.println("Total Cost For Wheel = "+wc.getWheelTotalCost());
      System.out.println("Total Cost For Frame = "+fc.getTotalFrameCost());
      System.out.println("Total Cost For Chain Assembly = "+cc.chainAsseblyCost());
      System.out.println("Total Cost For HandleBar  = "+hc.handleBarTotalCost());
      System.out.println("Total Cost For Seating  = "+scc.seatingTotalCost());
      int cycleCost= fc.getTotalFrameCost()+wc.getWheelTotalCost()+cc.chainAsseblyCost()+hc.handleBarTotalCost()+scc.seatingTotalCost();
      System.out.println("Total Cycle Cost  ="+cycleCost );
      System.out.println("Thanks for Buying, Have safe a ride");
	}
	}


