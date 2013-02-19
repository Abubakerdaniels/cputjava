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
public class AsserFalseNGTest {
    private AsserFalse assertF;
    public AsserFalseNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
    
    @Test
    public void testIsNotPalindrome() 
    {
        System.out.println("isNotPalindrome");
        int digit = 41;
        boolean expResult = false;
        boolean result = assertF.isNotPalindrome(digit);
        assertFalse(result);    
    }
}
