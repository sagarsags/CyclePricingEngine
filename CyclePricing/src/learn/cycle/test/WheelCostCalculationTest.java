package learn.cycle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.cycle.componentspecification.WheelSpecification;
import learn.cycle.costcalculation.WheelCostCalculation;

public class WheelCostCalculationTest {

	@Test
	public void test() {
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
		int output=wc.getWheelTotalCost();
		assertEquals(2820, output);
	}

}
