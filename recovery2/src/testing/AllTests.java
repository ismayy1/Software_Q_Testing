package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTestsExcludingSlowTests.class, TestPersonCalcAvgCosts.class, TestPersonConstructor.class })
public class AllTests {

}
