package dp._3_structuralPatterns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dp._3_structuralPatterns._1_adapter.test.ImperialWeatherAdapterTest;
import dp._3_structuralPatterns._2_decorator.test.PizzaBungaTest;
import dp._3_structuralPatterns._3_facade.test.VideoPlayerClientTest;

/**
 * @author mibejm
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ ImperialWeatherAdapterTest.class, PizzaBungaTest.class, VideoPlayerClientTest.class })
public class StructuralPatternsMasterSuite {

}
