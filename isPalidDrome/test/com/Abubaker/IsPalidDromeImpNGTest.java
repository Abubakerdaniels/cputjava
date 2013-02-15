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
public class IsPalidDromeImpNGTest {
    
    public IsPalidDromeImpNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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

    /**
     * Test of isPalindrome method, of class IsPalidDromeImp.
     */
    @Test
    public void testIsPalindrome1() 
    {
        System.out.println("isPalindrome");
        int digit = 717;
        IsPalidDromeImp instance = new IsPalidDromeImp();
        boolean expResult = true;
        boolean result = instance.isPalindrome(digit);
        assertTrue(result);
       
    }
    
    @Test
    public void testIsNotPalindrome() 
    {
        System.out.println("isNotPalindrome");
        int digit = 41;
        IsPalidDromeImp instance = new IsPalidDromeImp();
        boolean expResult = false;
        boolean result = instance.isNotPalindrome(digit);
        assertFalse(result);    
    }
    
    @Test
    public String testReturnPalidrome() 
    {
        System.out.println("isNotPalindrome");
        String status ="true";
        IsPalidDromeImp instance = new IsPalidDromeImp();
        String expResult = null;
        String result = instance.returnPalidrome();
        assertNull(result);   
        return "";
    }
    
}
