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
		if(fs.getFrameMaterials()==1)
		{
			frameMaterialCost=+400;
		}
		else if(fs.getFrameMaterials()==2)
		{
			frameMaterialCost=+300;
		}
		else if(fs.getFrameMaterials()==3)
		{
			frameMaterialCost=+1000;
		}
		else 
		{
			frameMaterialCost=+600;
		}
	}

	@Override
	public void getFrameSizeCost(FrameSpecification fs) {
		// TODO Auto-generated method stub
		if(fs.getFrameSize()==1)
		{
			frameSizeCost=+100;
		}
		else if(fs.getFrameSize()==2)
		{
			frameSizeCost=+200;
		}
		else if(fs.getFrameSize()==3)
		{
			frameSizeCost=+300;
		}
		else 
		{
			frameSizeCost=+200;
		}
	}
    public int getTotalFrameCost()
    {
    	frameCost=frameSizeCost+frameMaterialCost;
    	return frameCost;
    }
}
