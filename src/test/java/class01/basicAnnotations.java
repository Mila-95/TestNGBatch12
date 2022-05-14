package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basicAnnotations {
    //execution happens in alphabetical order
    @Test(groups = "smoke")
    public void  cfirstTest(){
        System.out.println("This is my first testcase");
    }
    @Test
    public void asecondTest(){
        System.out.println("This is my second testcase");
    }
    @Test
    public void bthirdTest(){
        System.out.println("This is my third testcase");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("************ I am Precondition ************");
    }
    @AfterMethod
    public void aftermathod(){
        System.out.println("*** AM Post-condition");
    }
}
