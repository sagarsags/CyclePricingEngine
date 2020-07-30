package learn.cycle.costcalculation;

import learn.cycle.component.ChainAssembly;
import learn.cycle.componentspecification.ChainAssemblySpecification;

public class ChainAssemblyCostCalculation implements ChainAssembly
{
	private int chainGearCost=0;
	private int chainMaterialCost=0;
	private int chainAsseblyCost=0;
	@Override
	public void getGearCost(ChainAssemblySpecification cs) {
		// TODO Auto-generated method stub
		switch (cs.getChainGear()) {
		case 1 : chainGearCost += 600;
			     break;
		case 2 : chainGearCost += 800;
				 break;
		default :chainGearCost+= 400;
		}
	}

	@Override
	public void getchainMaterialCost(ChainAssemblySpecification cs) {
		// TODO Auto-generated method stub
		switch (cs.getChainMaterial()) {
		case 1:
			chainMaterialCost += 200;
			break;
		case 2:
			chainMaterialCost += 300;
			break;
		case 3:
			chainMaterialCost += 400;
			break;
		default:
			chainMaterialCost += 200;
		}
	}

	public int chainAsseblyCost()
	{
		chainAsseblyCost=chainMaterialCost+chainGearCost;
		return chainAsseblyCost;
	}
}
