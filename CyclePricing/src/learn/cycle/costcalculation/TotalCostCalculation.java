package learn.cycle.costcalculation;

import learn.cycle.componentspecification.ChainAssemblySpecification;
import learn.cycle.componentspecification.FrameSpecification;
import learn.cycle.componentspecification.HandleBarSpecification;
import learn.cycle.componentspecification.SeatingSpecification;
import learn.cycle.componentspecification.WheelSpecification;

public class TotalCostCalculation {

	private static int fareChange=0;
	private static int defaultYear=2016;
	
	public int totalCostCalculation(WheelSpecification ws, FrameSpecification fs, HandleBarSpecification hs,
			ChainAssemblySpecification cs, SeatingSpecification ss,int year) {
		WheelCostCalculation wc = new WheelCostCalculation();
		TotalCostCalculation.calculateFareChangedBasedOnYear(year);
		wc.getRimCost(ws,fareChange);
		wc.getSpokesCost(ws,fareChange);
		wc.getTubeCost(ws,fareChange);
		wc.getTyreCost(ws,fareChange);
		System.out.println("			Wheel Specification Total Cost = " + wc.getWheelTotalCost());

		ChainAssemblyCostCalculation cc = new ChainAssemblyCostCalculation();
		cc.getchainMaterialCost(cs,fareChange);
		cc.getGearCost(cs,fareChange);
		System.out.println("			Chain Specification Total Cost = " + cc.getChainAssemblyTotalCost());

		FrameCostCalculation fc = new FrameCostCalculation();
		fc.getFrameMaterialCost(fs,fareChange);
		fc.getFrameSizeCost(fs,fareChange);
		fc.getFrameSizeCost(fs,fareChange);
		System.out.println("			Frame Specification Total Cost = " + fc.getTotalFrameCost());

		HandleBarCostCalculation hc = new HandleBarCostCalculation();
		hc.getHandleBarCoveringCost(hs,fareChange);
		hc.getHandleBarMaterialCost(hs,fareChange);
		hc.getHandleBarTypeCost(hs,fareChange);
		System.out.println("			HandleBar Specification Total Cost = " + hc.getHandleBarTotalCost());

		SeatingCostCalculation sc = new SeatingCostCalculation();
		sc.getSeatingCapacityCost(ss,fareChange);
		sc.getSeatingCoverCost(ss,fareChange);
		System.out.println("			Seating Specification Total Cost = " + sc.getseatingTotalCost());
		int totalCost = wc.getWheelTotalCost() + cc.getChainAssemblyTotalCost() + fc.getTotalFrameCost()
				+ hc.getHandleBarTotalCost() + sc.getseatingTotalCost();

		return totalCost;
	}
	private static void calculateFareChangedBasedOnYear(int year)
	{
		int difference=Math.abs(defaultYear-year);
		fareChange=difference*20;
		
	}
}
