package org.example;

//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//import org.junit.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    @Test

    public void testcase1_login(){
        App a = new App();
        Assert.assertEquals(true,a.login_test("user","user1"));

    }
    @Test
    public void testcase2_login(){
        App a = new App();
        Assert.assertEquals(false,a.login_test("ten", "tt123"));

    }
}
