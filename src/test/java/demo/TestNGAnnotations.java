package demo;

import org.testng.annotations.*;

public class TestNGAnnotations extends TestNGAnnotaions2{
    Calculator calculator;

    @Test
    public void test1() {
        System.out.println("test1");
        calculator.add(1, 2);
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }


    public void test4() {
        System.out.println("test4");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
        calculator = new Calculator();
    }


    @BeforeMethod
    public void beforeMethod1() {
        System.out.println("Before method1");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterMethod
    public void afterMethod1() {
        System.out.println("After method1");
    }
}
