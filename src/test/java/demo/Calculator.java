package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Calculator extends TestNGAnnotaions2{

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero is not allowed");
        }
        return a / b;
    }


    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
                            // actual result,       //expected
        assertEquals(calculator.add(1, 2), 3);
        Assert.assertEquals(calculator.add(100, 200), 300);
    }

    @Test(groups = "UI")
    void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(5, 2), 3);
        System.out.println("Hello World123");
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5, 2), 10);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(5, 0), 1);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5, 0);
            Assert.fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            // Assert the message if needed
            Assert.assertEquals(e.getMessage(), "Divide by zero is not allowed");
        }
    }

    @Test
    public void testMultiplyByZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5, 0), 0);
    }
}