package class2;

import org.testng.annotations.*;

public class testing {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("After suit");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class method");
    }

    @BeforeMethod
    public void before(){
        System.out.println("this is my before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("this is my after method");
    }
    @Test
    public void Test(){
        System.out.println("Drive me crazy, drive me mad");
    }
    @Test
    public void Test2(){
        System.out.println("Drive me sanity, drive me to hell");
    }

}
