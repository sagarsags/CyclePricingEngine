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
		assertEquals(1460, cc.getChainAssemblyTotalCost());
		cs.setChainGear(2);
		cs.setChainMaterial(2);
		cc.getchainMaterialCost(cs, 60);
		cc.getGearCost(cs, 60);
		assertEquals(2220, cc.getChainAssemblyTotalCost());
	}

}
