package learn.cycle.component;

import learn.cycle.componentspecification.WheelSpecification;

public interface Wheel {
	public void getSpokesCost(WheelSpecification ws,int fareChange);
	public void getTubeCost(WheelSpecification ws,int fareChange);
	public void getTyreCost(WheelSpecification ws,int fareChange);
	public void getRimCost(WheelSpecification ws,int fareChange);
}
