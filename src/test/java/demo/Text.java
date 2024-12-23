package demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Text extends DataProviderDemo {


    public String printFirstTwoLetters(String text) {
        return text.substring(0, 2).toLowerCase() + text.substring(2);
    }

    public static void main(String[] args) {
        Text text = new Text();
        System.out.println(text.printFirstTwoLetters("Hello World!"));
    }

    @Test
    public void test() {
        Text text = new Text();
        String result = "Hello World!";

        Assert.assertTrue(text.printFirstTwoLetters(result).charAt(0) == 'h');

    }

    DataProviderDemo dataProviderDemo = new DataProviderDemo();

    @Test(dataProvider = "user credentials")
    public void testLogin1(String username, String password) {
        System.out.println("Go to Facebook login page");
        System.out.println("Input username and password " + username + " " + password);
    }
}
