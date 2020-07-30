package learn.cycle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.cycle.componentspecification.FrameSpecification;
import learn.cycle.costcalculation.FrameCostCalculation;

public class FrameCostCalCulationTest {

	@Test
	public void test() {
		FrameSpecification fs=new FrameSpecification();
		fs.setFrameMaterials(1);
		fs.setFrameSize(1);
		FrameCostCalculation fc=new FrameCostCalculation();
		fc.getFrameSizeCost(fs, 80);
		fc.getFrameMaterialCost(fs, 80);
		int output=fc.getTotalFrameCost();
		assertEquals(1260, output);
	}

}
