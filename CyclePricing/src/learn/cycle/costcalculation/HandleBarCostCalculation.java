package learn.cycle.costcalculation;

import learn.cycle.component.HandleBar;
import learn.cycle.componentspecification.HandleBarSpecification;

public class HandleBarCostCalculation implements HandleBar{

	private int handleBarTypeCost=0;
	private int handleBarCoverCost=0;
	private int handleBarMaterialCost=0;
	private int handleBarTotalCost=0;
	@Override
	public void getHandleBarTypeCost(HandleBarSpecification hs) {
		// TODO Auto-generated method stub
		if(hs.getHandleBarType()==1)
		{
			handleBarTypeCost=+200;
		}
		else if(hs.getHandleBarType()==2)
		{
			handleBarTypeCost=+300;
		}
		else if(hs.getHandleBarType()==3)
		{
			handleBarTypeCost=+400;
		}
		else 
		{
			handleBarTypeCost=+100;
		}
	}

	@Override
	public void getHandleBarMaterialCost(HandleBarSpecification hs) {
		// TODO Auto-generated method stub
		if(hs.getHandleBarMaterial()==1)
		{
			handleBarMaterialCost=+70;
		}
		else if(hs.getHandleBarMaterial()==2)
		{
			handleBarMaterialCost=+50;
		}
		else if(hs.getHandleBarMaterial()==3)
		{
			handleBarMaterialCost=+150;
		}
		else 
		{
			handleBarTypeCost=+100;
		}
	}

	@Override
	public void getHandleBarCoveringCost(HandleBarSpecification hs) {
		// TODO Auto-generated method stub
		if(hs.getHandleBarMaterial()==1)
		{
			handleBarCoverCost=+30;
		}
		else if(hs.getHandleBarMaterial()==2)
		{
			handleBarCoverCost=+50;
		}
		else if(hs.getHandleBarMaterial()==3)
		{
			handleBarCoverCost=+35;
		}
		else 
		{
			handleBarCoverCost=+40;
		}
	}
	public  int handleBarTotalCost()
	{
		handleBarTotalCost=handleBarTypeCost+handleBarCoverCost+handleBarMaterialCost;
		return handleBarTotalCost;
	}
	

}
