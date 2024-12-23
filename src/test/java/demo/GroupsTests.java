package demo;

import org.testng.annotations.Test;

public class GroupsTests {


    @Test(groups = "UI")
    public void testGroups1() {
        System.out.println("testGroups1");
    }

    @Test(groups = "API")
    public void testGroups2() {
        System.out.println("testGroups2");
    }

    @Test(groups = "UI", enabled = false)
    public void testGroups3() {
        System.out.println("testGroups3");
    }

    @Test(groups = {"UI","ID-123"}, description = "This test for testGroup 4")
    public void testGroups4() {
        System.out.println("testGroups4");
    }
}
