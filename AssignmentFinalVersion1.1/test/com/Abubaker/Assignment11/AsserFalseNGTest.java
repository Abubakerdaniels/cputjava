/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker.Assignment11;

import com.Abubaker.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Abu
 */
public class AsserFalseNGTest {
    private static AsserFalse assertF;
    private static ApplicationContext ctx;
    public AsserFalseNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        assertF=(AsserFalse)ctx.getBean("False");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception
    {
        assertF=new AssertFalseImp();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     *
     */
    @Test(timeOut=1)
    public void testIsNotPalindrome() 
    {
      
        System.out.println("isNotPalindrome");
        int digit = 41;
        boolean expResult=false;
        boolean result = assertF.isNotPalindrome(digit);
        assertFalse(result);    
    }
}
