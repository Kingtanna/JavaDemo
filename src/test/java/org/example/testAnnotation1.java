package org.example;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testAnnotation1 {
    @Test
    public void test1() {
        System.out.print("test1 from group1");
    }

    @Test(enabled = false)
    public void test11() {
        System.out.print("test11 from group1");
    }

    @Test(timeOut = 1000)
    public void test111() throws InterruptedException {
        Thread.sleep(3000);
        System.out.print("test111 from group1");
    }
//
//    @Test
//    public void test2()
//    {
//        System.out.println("test2 from group2");
//        Assert.assertTrue(true);
//    }
//
//    @BeforeTest
//    public void beforeTest()
//    {
//        System.out.println("beforeTest");
//    }
//
//    @AfterTest
//    public void afterTest()
//    {
//        System.out.println("afterTest");
//    }
//
//    @BeforeClass
//    public void beforeClass()
//    {
//        System.out.println("beforeClass");
//    }
//
//    @AfterClass
//    public void afterClass()
//    {
//        System.out.println("afterClass");
//    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite运行");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite运行");
    }

//    //只对group1有效，即test1和test11
//    @BeforeGroups(groups="group1")
//    public void beforeGroups()
//    {
//        System.out.println("beforeGroups");
//    }
//
//    //只对group1有效，即test1和test11
//    @AfterGroups(groups="group1")
//    public void afterGroups()
//    {
//        System.out.println("afterGroups");
//    }

//    @BeforeMethod
//    public void beforeMethod()
//    {
//        System.out.println("beforeMethod");
//    }
//
//    @AfterMethod
//    public void afterMethod()
//    {
//        System.out.println("afterMethod");
//    }

}

