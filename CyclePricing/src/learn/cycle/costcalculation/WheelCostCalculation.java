package learn.cycle.costcalculation;

import learn.cycle.component.Wheel;
import learn.cycle.componentspecification.WheelSpecification;

public class WheelCostCalculation implements Wheel{

	private int wheelCost=0;
	private int spokesCost=0;
	private int tubeCost=0;
	private int tyreCost=0;
	private int rimCost=0;
	@Override
	public void getSpokesCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getSpokes()==1)
		{
			this.spokesCost=+400;
		}
		else if(ws.getSpokes()==2)
		{
			this.spokesCost=+600;
		}
		else 
		{
			this.spokesCost=+500;
		}
		
	}

	@Override
	public void getTubeCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getTube()==1)
		{
			tubeCost=+200;
		}
		else if(ws.getTube()==2)
		{
			tubeCost=+400;
		}
		else 
		{
			tubeCost=+300;
		}
		
	}

	@Override
	public void getRimCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getRim()==1 && ws.getTube()==1)
		{
			rimCost=+600;
		}
		else if(ws.getRim()==2 && ws.getTube()==2)
		{
			rimCost=+500;
		}
		else 
		{
			rimCost=+400;
		}
		
	}

	@Override
	public void getTyreCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getRim()==1)
		{
			tyreCost=+600;
		}
		else if(ws.getTyre()==2)
		{
			tyreCost=+200;
		}
		else 
		{
			tyreCost=+400;
		}
	}
	public int getWheelTotalCost()
	{
		wheelCost=tyreCost+rimCost+tubeCost+spokesCost;
		return wheelCost;
	}

}
