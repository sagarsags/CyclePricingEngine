package learn.cycle.component;

import learn.cycle.componentspecification.SeatingSpecification;

public interface Seating {
	public void getSeatingCapacityCost(SeatingSpecification ss,int fareChange);
	public void getSeatingCoverCost(SeatingSpecification ss,int fareChange);
}
