package learn.cycle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.cycle.componentspecification.SeatingSpecification;
import learn.cycle.costcalculation.SeatingCostCalculation;

public class SeatingCostCalculationTest {

	@Test
	public void test() {
		SeatingSpecification ss=new SeatingSpecification();
		ss.setSeatCover(1);
		ss.setSeatingCapacity(1);
	    SeatingCostCalculation sc=new SeatingCostCalculation();
	    sc.getSeatingCapacityCost(ss, 80);
	    sc.getSeatingCoverCost(ss, 80);
	    int output=sc.getseatingTotalCost();
	    assertEquals(960, output);
	}

}
