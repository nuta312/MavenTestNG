package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTests {


    @Test
    @Parameters("browser2")
    public void test1(@Optional("opera") String browser ) {
        System.out.println("Running test " + browser + " with parameters " );
    }
}
