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
		switch (ws.getSpokes()) {
		case 1:
			spokesCost += 400;
			break;
		case 2:
			spokesCost += 600;
			break;
		default:
			spokesCost += 500;
		}
	}

	@Override
	public void getTubeCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		switch (ws.getTube()) {
		case 1:
			tubeCost += 200;
			break;
		case 2:
			tubeCost += 400;
			break;
		default:
			tubeCost += 300;
		}
	}

	@Override
	public void getRimCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		switch (ws.getRim()) {
		case 1:
			rimCost += 600;
			break;
		case 2:
			rimCost += 500;
			break;
		default:
			rimCost += 400;
		}
	}

	@Override
	public void getTyreCost(WheelSpecification ws) {
		// TODO Auto-generated method stub
		switch (ws.getTyre()) {
		case 1:
			tyreCost += 600;
			break;
		case 2:
			tyreCost += 200;
			break;
		default:
			tyreCost += 400;
		}
	}
	public int getWheelTotalCost()
	{
		wheelCost=tyreCost+rimCost+tubeCost+spokesCost;
		return wheelCost;
	}

}
