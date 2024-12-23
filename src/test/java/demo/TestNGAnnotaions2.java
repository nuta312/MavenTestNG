package demo;

import org.testng.annotations.BeforeSuite;

public class TestNGAnnotaions2 {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
}
