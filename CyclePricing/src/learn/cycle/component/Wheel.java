package learn.cycle.component;

import learn.cycle.componentspecification.WheelSpecification;

public interface Wheel {
	public void getSpokesCost(WheelSpecification ws);
	public void getTubeCost(WheelSpecification ws);
	public void getTyreCost(WheelSpecification ws);
	public void getRimCost(WheelSpecification ws);
}
