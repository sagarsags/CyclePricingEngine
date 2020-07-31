package learn.cycle.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ChainAssemblyCostCalculationTest.class, FrameCostCalCulationTest.class,
		HandleBarCostCalculationTest.class, SeatingCostCalculationTest.class, TotalCostCalculationTest.class,
		WheelCostCalculationTest.class })
public class AllTests {

}
