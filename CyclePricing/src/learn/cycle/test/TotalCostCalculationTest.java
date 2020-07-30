package learn.cycle.test;

import static org.junit.Assert.*;

import org.junit.Test;

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

public class TotalCostCalculationTest {

	@Test
	public void test() {
		ChainAssemblySpecification cs=new ChainAssemblySpecification();
		cs.setChainGear(1);
		cs.setChainMaterial(1);
		ChainAssemblyCostCalculation cc=new ChainAssemblyCostCalculation();
		cc.getchainMaterialCost(cs, 80);
		cc.getGearCost(cs, 80);
		int chain=cc.getChainAssemblyTotalCost();
		
		SeatingSpecification ss=new SeatingSpecification();
		ss.setSeatCover(1);
		ss.setSeatingCapacity(1);
	    SeatingCostCalculation sc=new SeatingCostCalculation();
	    sc.getSeatingCapacityCost(ss, 80);
	    sc.getSeatingCoverCost(ss, 80);
	    int seating=sc.getseatingTotalCost();
	    
	    HandleBarSpecification hs=new HandleBarSpecification();
		hs.setHandleBarCovering(1);
		hs.setHandleBarMaterial(1);
		hs.setHandleBarType(1);
		HandleBarCostCalculation hc=new HandleBarCostCalculation();
		hc.getHandleBarCoveringCost(hs, 80);
		hc.getHandleBarMaterialCost(hs, 80);
		hc.getHandleBarTypeCost(hs, 80);
		int handlebar=hc.getHandleBarTotalCost();
		
		FrameSpecification fs=new FrameSpecification();
		fs.setFrameMaterials(1);
		fs.setFrameSize(1);
		FrameCostCalculation fc=new FrameCostCalculation();
		fc.getFrameSizeCost(fs, 80);
		fc.getFrameMaterialCost(fs, 80);
		int frame=fc.getTotalFrameCost();
		
		WheelSpecification ws=new WheelSpecification();
		ws.setRim(1);
		ws.setSpokes(1);
		ws.setTube(1);
		ws.setTyre(1);
		WheelCostCalculation wc=new WheelCostCalculation();
		wc.getRimCost(ws, 80);
		wc.getSpokesCost(ws, 80);
		wc.getTyreCost(ws, 80);
		wc.getTubeCost(ws, 80);
		int wheel=wc.getWheelTotalCost();
		int output = wheel+frame+seating+handlebar+chain;
		assertEquals(7070, output);
		
	}

}
