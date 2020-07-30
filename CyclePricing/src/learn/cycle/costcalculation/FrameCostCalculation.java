package learn.cycle.costcalculation;

import learn.cycle.component.Frame;
import learn.cycle.componentspecification.FrameSpecification;

public class FrameCostCalculation implements Frame {

	private int frameCost=0;
	private int frameMaterialCost=0;
	private int frameSizeCost=0;
	@Override
	public void getFrameMaterialCost(FrameSpecification fs) {
		// TODO Auto-generated method stub
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
	public void getFrameSizeCost(FrameSpecification fs) {
		// TODO Auto-generated method stub
		switch (fs.getFrameSize()) {
		case 1:
			frameSizeCost += 200;
			break;
		case 2:
			frameSizeCost += 400;
			break;
		case 3:
			frameSizeCost += 500;
			break;
		default:
			frameSizeCost += 300;
		}
		
	}
    public int getTotalFrameCost()
    {
    	frameCost=frameSizeCost+frameMaterialCost;
    	return frameCost;
    }
}
