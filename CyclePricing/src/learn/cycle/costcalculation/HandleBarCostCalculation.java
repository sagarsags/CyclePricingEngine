package learn.cycle.costcalculation;

import learn.cycle.component.HandleBar;
import learn.cycle.componentspecification.HandleBarSpecification;

public class HandleBarCostCalculation implements HandleBar {

	private int handleBarTypeCost = 0;
	private int handleBarCoverCost = 0;
	private int handleBarMaterialCost = 0;

	@Override
	public void getHandleBarTypeCost(HandleBarSpecification hs,int fareChange) {
		// TODO Auto-generated method stub
		handleBarTypeCost=fareChange;
		switch (hs.getHandleBarType()) {
		case 1:
			handleBarTypeCost += 200;
			break;
		case 2:
			handleBarTypeCost += 400;
			break;
		case 3:
			handleBarTypeCost += 700;
			break;
		default:
			handleBarTypeCost += 200;
		}
	}

	@Override
	public void getHandleBarMaterialCost(HandleBarSpecification hs,int fareChange) {
		// TODO Auto-generated method stub
		handleBarMaterialCost=fareChange;
		switch (hs.getHandleBarMaterial()) {
		case 1:
			handleBarMaterialCost += 100;
			break;
		case 2:
			handleBarMaterialCost += 250;
			break;
		case 3:
			handleBarMaterialCost += 500;
			break;
		default:
			handleBarMaterialCost += 100;
		}
	}

	@Override
	public void getHandleBarCoveringCost(HandleBarSpecification hs,int fareChange) {
		// TODO Auto-generated method stub
		handleBarCoverCost=fareChange;
		switch (hs.getHandleBarMaterial()) {
		case 1:
			handleBarCoverCost += 30;
			break;
		case 2:
			handleBarCoverCost += 200;
			break;
		case 3:
			handleBarCoverCost += 300;
			break;
		default:
			handleBarCoverCost += 40;
		}
	}

	public int getHandleBarTotalCost() {
		return handleBarTypeCost + handleBarCoverCost + handleBarMaterialCost;
	}

}
