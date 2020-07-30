package learn.cycle.costcalculation;

import learn.cycle.component.Frame;
import learn.cycle.componentspecification.FrameSpecification;

public class FrameCostCalculation implements Frame {

	private int frameMaterialCost = 0;
	private int frameSizeCost = 0;

	@Override
	public void getFrameMaterialCost(FrameSpecification fs,int fareChange) {
		// TODO Auto-generated method stub
		frameMaterialCost=fareChange;
		switch (fs.getFrameMaterials()) {
		case 1:
			frameMaterialCost += 800;
			break;
		case 2:
			frameMaterialCost += 700;
			break;
		case 3:
			frameMaterialCost += 1000;
			break;
		default:
			frameMaterialCost += 700;
		}
	}

	@Override
	public void getFrameSizeCost(FrameSpecification fs,int fareChange) {
		// TODO Auto-generated method stub
		frameSizeCost=fareChange;
		switch (fs.getFrameSize()) {
		case 1:
			frameSizeCost += 300;
			break;
		case 2:
			frameSizeCost += 600;
			break;
		case 3:
			frameSizeCost += 1000;
			break;
		default:
			frameSizeCost += 300;
		}
	}

	public int getTotalFrameCost() {
		return  frameSizeCost + frameMaterialCost;
	}
}
