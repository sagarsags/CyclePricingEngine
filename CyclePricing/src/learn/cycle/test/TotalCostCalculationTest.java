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
		//first testcase
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
		assertEquals(7070,wheel+frame+seating+handlebar+chain);
		
		//second testcase
		cs.setChainGear(2);
		cs.setChainMaterial(2);
		cc.getchainMaterialCost(cs, 60);
		cc.getGearCost(cs, 60);
		chain=cc.getChainAssemblyTotalCost();
		
		hs.setHandleBarCovering(2);
		hs.setHandleBarMaterial(2);
		hs.setHandleBarType(2);
		hc.getHandleBarCoveringCost(hs, 60);
		hc.getHandleBarMaterialCost(hs, 60);
		hc.getHandleBarTypeCost(hs, 60);
		handlebar=hc.getHandleBarTotalCost();
		
		ss.setSeatCover(2);
		ss.setSeatingCapacity(2);
		sc.getSeatingCapacityCost(ss, 60);
	    sc.getSeatingCoverCost(ss, 60);
	    seating=sc.getseatingTotalCost();
	   
	    fs.setFrameMaterials(2);
		fs.setFrameSize(2);
		fc.getFrameSizeCost(fs, 60);
		fc.getFrameMaterialCost(fs, 60);
		frame=fc.getTotalFrameCost();
		
		ws.setRim(2);
		ws.setSpokes(2);
		ws.setTube(2);
		ws.setTyre(2);
		wc.getRimCost(ws, 60);
		wc.getSpokesCost(ws, 60);
		wc.getTyreCost(ws, 60);
		wc.getTubeCost(ws, 60);
		wheel=wc.getWheelTotalCost();
		assertEquals(9580,wheel+frame+seating+handlebar+chain);
	}

}
