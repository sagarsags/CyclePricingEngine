package learn.cycle.costcalculation;

import learn.cycle.component.Wheel;
import learn.cycle.componentspecification.WheelSpecification;

public class WheelCostCalculation implements Wheel {
	private int spokesCost = 0;
	private int tubeCost = 0;
	private int tyreCost = 0;
	private int rimCost = 0;
    
	@Override
	public void getSpokesCost(WheelSpecification ws,int fareChange) {
		// TODO Auto-generated method stub
		spokesCost=fareChange;
		switch (ws.getSpokes()) {
		case 1:
			spokesCost += 600;
			break;
		case 2:
			spokesCost += 1200;
			break;
		default:
			spokesCost += 600;
		}
	}

	@Override
	public void getTubeCost(WheelSpecification ws,int fareChange) {
		// TODO Auto-generated method stub
		tubeCost=fareChange;
		switch (ws.getTube()) {
		case 1:
			tubeCost += 500;
			break;
		case 2:
			tubeCost += 1000;
			break;
		default:
			tubeCost += 400;
		}
	}

	@Override
	public void getRimCost(WheelSpecification ws,int fareChange) {
		// TODO Auto-generated method stub
		rimCost=fareChange;
		switch (ws.getRim()) {
		case 1:
			rimCost += 600;
			break;
		case 2:
			rimCost += 1000;
			break;
		default:
			rimCost += 600;
		}
	}

	@Override
	public void getTyreCost(WheelSpecification ws,int fareChange) {
		tyreCost=fareChange;
		// TODO Auto-generated method stub
		switch (ws.getTyre()) {
		case 1:
			tyreCost += 800;
			break;
		case 2:
			tyreCost += 400;
			break;
		default:
			tyreCost += 400;
		}
	}

	public int getWheelTotalCost() {
		return tyreCost + rimCost + tubeCost + spokesCost;
	}
    
	
}
