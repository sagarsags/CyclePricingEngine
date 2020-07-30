package learn.cycle.component;

import learn.cycle.componentspecification.ChainAssemblySpecification;

public interface ChainAssembly {
	public void getGearCost(ChainAssemblySpecification cs,int fareChange);
	public void getchainMaterialCost(ChainAssemblySpecification cs,int fareChange);
}
