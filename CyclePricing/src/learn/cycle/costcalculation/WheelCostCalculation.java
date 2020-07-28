package learn.cycle.costcalculation;

import learn.cycle.component.Wheel;
import learn.cycle.componentspecification.WheelSpecification;

public class WheelCostCalculation implements Wheel{

	private int wheelCost=0;
	@Override
	public void getSpokesCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getSpokes().equals("SingleRider"))
		{
			wheelCost=+400;
		}
		else if(ws.getSpokes().equals("DoubleRider"))
		{
			wheelCost=+600;
		}
		else 
		{
			wheelCost=+500;
		}
	}

	@Override
	public void getTubeCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getTube().equals("WithTube"))
		{
			wheelCost=+200;
		}
		else if(ws.getTube().equals("TubeLess"))
		{
			wheelCost=+400;
		}
		else 
		{
			wheelCost=+300;
		}
	}

	@Override
	public void getRimCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getRim().equals("TubeLess") && ws.getTube().equals("TubeLess"))
		{
			wheelCost=+600;
		}
		else if(ws.getRim().equals("WithTube") && ws.getTube().equals("WithTube"))
		{
			wheelCost=+500;
		}
		else 
		{
			wheelCost=+400;
		}
	}

	@Override
	public void getTyreCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		if(ws.getRim().equals("Branded"))
		{
			wheelCost=+600;
		}
		else if(ws.getTyre().equals("NonBranded"))
		{
			wheelCost=+200;
		}
		else 
		{
			wheelCost=+400;
		}
	}

}
