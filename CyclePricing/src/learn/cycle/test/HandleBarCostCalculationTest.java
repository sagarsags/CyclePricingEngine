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
		int output=hc.getHandleBarTotalCost();
		assertEquals(570, output);
	}

}
