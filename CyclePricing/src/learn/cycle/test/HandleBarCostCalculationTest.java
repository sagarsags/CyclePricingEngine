package learn.cycle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.cycle.componentspecification.HandleBarSpecification;
import learn.cycle.costcalculation.HandleBarCostCalculation;

public class HandleBarCostCalculationTest {

	@Test
	public void test() {
		HandleBarSpecification hs=new HandleBarSpecification();
		hs.setHandleBarCovering(1);
		hs.setHandleBarMaterial(1);
		hs.setHandleBarType(1);
		HandleBarCostCalculation hc=new HandleBarCostCalculation();
		hc.getHandleBarCoveringCost(hs, 80);
		hc.getHandleBarMaterialCost(hs, 80);
		hc.getHandleBarTypeCost(hs, 80);
		assertEquals(570, hc.getHandleBarTotalCost());
		hs.setHandleBarCovering(2);
		hs.setHandleBarMaterial(2);
		hs.setHandleBarType(2);
		hc.getHandleBarCoveringCost(hs, 60);
		hc.getHandleBarMaterialCost(hs, 60);
		hc.getHandleBarTypeCost(hs, 60);
		assertEquals(1030, hc.getHandleBarTotalCost());
	}

}
