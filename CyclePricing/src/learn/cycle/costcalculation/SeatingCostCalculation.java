package learn.cycle.costcalculation;

import learn.cycle.component.Seating;
import learn.cycle.componentspecification.SeatingSpecification;

public class SeatingCostCalculation implements Seating{

	private int seatingCapacityCost=0;
	private int seatingCoverCost=0;
	
	@Override
	public void getSeatingCapacityCost(SeatingSpecification ss,int fareChange) {
		// TODO Auto-generated method stub
		seatingCapacityCost=fareChange;
		switch (ss.getSeatingCapacity()) {
		case 1:
			seatingCapacityCost += 400;
			break;
		case 2:
			seatingCapacityCost += 700;
			break;
		default:
			seatingCapacityCost += 400;
		}
	}

	@Override
	public void getSeatingCoverCost(SeatingSpecification ss,int fareChange) {
		// TODO Auto-generated method stub
		seatingCoverCost=fareChange;
		switch (ss.getSeatCover()) {
		case 1:
			seatingCoverCost += 400;
			break;
		case 2:
			seatingCoverCost += 250;
			break;
		default:
			seatingCoverCost += 300;
		}
		
	}
    public int getseatingTotalCost()
    {
    	return seatingCapacityCost+seatingCoverCost;
    }
	
}
