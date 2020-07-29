package learn.cycle.costcalculation;

import learn.cycle.component.ChainAssembly;
import learn.cycle.componentspecification.ChainAssemblySpecification;

public class ChainAssemblyCalculation implements ChainAssembly
{
	private int chainGearCost=0;
	private int chainMaterialCost=0;
	private int chainAsseblyCost=0;
	@Override
	public void getGearCost(ChainAssemblySpecification cs) {
		// TODO Auto-generated method stub
		if(cs.getChainGear()==1)
		{
			chainGearCost=+600;
		}
		else if(cs.getChainGear()==2)
		{
			chainGearCost=+800;
		}
		else
		{
			chainGearCost=+400;
		}
	}

	@Override
	public void getchainMaterialCost(ChainAssemblySpecification cs) {
		// TODO Auto-generated method stub
		if(cs.getChainMaterial()==1)
		{
			chainMaterialCost=+200;
		}
		else if(cs.getChainMaterial()==2)
		{
			chainMaterialCost=+300;
		}
		else if(cs.getChainMaterial()==3)
		{
			chainMaterialCost=+400;
		}
		else
		{
			chainMaterialCost=+200;
		}
	}

	public int chainAsseblyCost()
	{
		chainAsseblyCost=chainMaterialCost+chainGearCost;
		return chainAsseblyCost;
	}
}
