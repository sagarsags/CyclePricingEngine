package learn.cycle.component;

import learn.cycle.componentspecification.FrameSpecification;

public interface Frame {
	public void getFrameMaterialCost(FrameSpecification fs);
	public void getFrameSizeCost(FrameSpecification fs);
}
