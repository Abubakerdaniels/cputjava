/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

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
public class AssertTrueImpNGTest {
    private static AssertTrue palid;
    public AssertTrueImpNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        palid=new AssertTrueImp();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testIsPalindrome1() 
    {
        System.out.println("isPalindrome");
        int digit = 717;
        boolean expResult = true;
        boolean result = palid.isPalindrome(digit);
        assertTrue(result);
    }
    
}
