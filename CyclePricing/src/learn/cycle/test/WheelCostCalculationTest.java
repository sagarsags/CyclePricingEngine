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
		assertEquals(2820, wc.getWheelTotalCost());
		ws.setRim(2);
		ws.setSpokes(2);
		ws.setTube(2);
		ws.setTyre(2);
		wc.getRimCost(ws, 60);
		wc.getSpokesCost(ws, 60);
		wc.getTyreCost(ws, 60);
		wc.getTubeCost(ws, 60);
		assertEquals(3840, wc.getWheelTotalCost());
	}

}
