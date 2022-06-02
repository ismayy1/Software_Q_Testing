package testing;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import classes.SlowTestClass;

@RunWith(Categories.class)
@ExcludeCategory(SlowTestClass.class)
@SuiteClasses({ TestPersonCalcAvgCosts.class, TestPersonConstructor.class })
public class AllTestsExcludingSlowTests {

}
