package learn.cycle.costcalculation;

import learn.cycle.component.Seating;
import learn.cycle.componentspecification.SeatingSpecification;

public class SeatingCostCalculation implements Seating {

	private int seatingTotalCost = 0;
	private int seatingCapacityCost = 0;
	private int seatingCoverCost = 0;

	@Override
	public void getSeatingCapacityCost(SeatingSpecification ss) {
		// TODO Auto-generated method stub
		switch (ss.getSeatingCapacity()) {
		case 1:
			seatingCapacityCost += 500;
			break;
		case 2:
			seatingCapacityCost += 1000;
			break;
		default:
			seatingCapacityCost += 500;
		}
	}

	@Override
	public void getSeatingCoverCost(SeatingSpecification ss) {
		// TODO Auto-generated method stub
		switch (ss.getSeatCover()) {
		case 1:
			seatingCoverCost += 750;
			break;
		case 2:
			seatingCoverCost += 350;
			break;
		default:
			seatingCoverCost += 600;
		}
	}

	public int getSeatingTotalCost() {
		seatingTotalCost = seatingCapacityCost + seatingCoverCost;
		return seatingTotalCost;
	}
}
