package learn.cycle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.cycle.componentspecification.ChainAssemblySpecification;
import learn.cycle.costcalculation.ChainAssemblyCostCalculation;

public class ChainAssemblyCostCalculationTest {

	@Test
	public void test() {
		ChainAssemblySpecification cs=new ChainAssemblySpecification();
		cs.setChainGear(1);
		cs.setChainMaterial(1);
		ChainAssemblyCostCalculation cc=new ChainAssemblyCostCalculation();
		cc.getchainMaterialCost(cs, 80);
		cc.getGearCost(cs, 80);
		int ouput=cc.getChainAssemblyTotalCost();
		assertEquals(1460, ouput);
	}

}
