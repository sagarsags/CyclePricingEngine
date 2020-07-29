package learn.cycle.component;

import learn.cycle.componentspecification.HandleBarSpecification;

public interface HandleBar {
	public void getHandleBarTypeCost(HandleBarSpecification hs);
	public void getHandleBarMaterialCost(HandleBarSpecification hs);
	public void getHandleBarCoveringCost(HandleBarSpecification hs);
}
