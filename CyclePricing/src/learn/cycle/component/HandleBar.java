package learn.cycle.component;

import learn.cycle.componentspecification.HandleBarSpecification;

public interface HandleBar {
	public void getHandleBarTypeCost(HandleBarSpecification hs,int fareChange);
	public void getHandleBarMaterialCost(HandleBarSpecification hs,int fareChange);
	public void getHandleBarCoveringCost(HandleBarSpecification hs,int fareChange);
}
