package learn.cycle.costcalculation;

import learn.cycle.componentspecification.ChainAssemblySpecification;
import learn.cycle.componentspecification.FrameSpecification;
import learn.cycle.componentspecification.HandleBarSpecification;
import learn.cycle.componentspecification.SeatingSpecification;
import learn.cycle.componentspecification.WheelSpecification;

public class TotalCostCalculation {

	public int totalCostCalculation(WheelSpecification ws, FrameSpecification fs, HandleBarSpecification hs,
			ChainAssemblySpecification cs, SeatingSpecification ss) {
		WheelCostCalculation wc = new WheelCostCalculation();
		wc.getRimCost(ws);
		wc.getSpokesCost(ws);
		wc.getTubeCost(ws);
		wc.getTyreCost(ws);
		System.out.println("			Wheel Specification Total Cost = " + wc.getWheelTotalCost());

		ChainAssemblyCostCalculation cc = new ChainAssemblyCostCalculation();
		cc.getchainMaterialCost(cs);
		cc.getGearCost(cs);
		System.out.println("			Chain Specification Total Cost = " + cc.getChainAssemblyTotalCost());

		FrameCostCalculation fc = new FrameCostCalculation();
		fc.getFrameMaterialCost(fs);
		fc.getFrameSizeCost(fs);
		fc.getFrameSizeCost(fs);
		System.out.println("			Frame Specification Total Cost = " + fc.getTotalFrameCost());

		HandleBarCostCalculation hc = new HandleBarCostCalculation();
		hc.getHandleBarCoveringCost(hs);
		hc.getHandleBarMaterialCost(hs);
		hc.getHandleBarTypeCost(hs);
		System.out.println("			HandleBar Specification Total Cost = " + hc.getHandleBarTotalCost());

		SeatingCostCalculation sc = new SeatingCostCalculation();
		sc.getSeatingCapacityCost(ss);
		sc.getSeatingCoverCost(ss);
		System.out.println("			Seating Specification Total Cost = " + sc.getSeatingTotalCost());
		int totalCost = wc.getWheelTotalCost() + cc.getChainAssemblyTotalCost() + fc.getTotalFrameCost()
				+ hc.getHandleBarTotalCost() + sc.getSeatingTotalCost();

		return totalCost;
	}
}
