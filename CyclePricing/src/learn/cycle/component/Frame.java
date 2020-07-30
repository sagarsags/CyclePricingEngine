package learn.cycle.component;

import learn.cycle.componentspecification.FrameSpecification;

public interface Frame {
	public void getFrameMaterialCost(FrameSpecification fs,int fareChange);
	public void getFrameSizeCost(FrameSpecification fs,int fareChange);
}
