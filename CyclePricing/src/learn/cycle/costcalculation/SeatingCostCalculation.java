package learn.cycle.costcalculation;

import learn.cycle.component.Seating;
import learn.cycle.componentspecification.SeatingSpecification;

public class SeatingCostCalculation implements Seating{

	private int seatingTotalCost=0;
	private int seatingCapacityCost=0;
	private int seatingCoverCost=0;
	
	@Override
	public void getSeatingCapacityCost(SeatingSpecification ss) {
		// TODO Auto-generated method stub
		if(ss.getSeatingCapacity()==1)
		{
			seatingCapacityCost=+400;
		}
		else if(ss.getSeatingCapacity()==2)
		{
			seatingCapacityCost=+700;
		}
		else
		{
			seatingCapacityCost=+400;
		}
	}

	@Override
	public void getSeatingCoverCost(SeatingSpecification ss) {
		// TODO Auto-generated method stub
		if(ss.getSeatingCapacity()==1)
		{
			seatingCoverCost=+400;
		}
		else if(ss.getSeatingCapacity()==2)
		{
			seatingCoverCost=+250;
		}
		else
		{
			seatingCoverCost=+300;
		}
	}
    public int seatingTotalCost()
    {
    	seatingTotalCost=seatingCapacityCost+seatingCoverCost;
    	return seatingTotalCost;
    }
	
}
