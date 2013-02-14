/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abubaker;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Abu
 */
public class IsPalidDromeTest {
    @Test
    private static void fail(String not_palidDrome)
    {
        System.out.println("Fail");
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    private IsPalidDrome Paliddrome;
            
    public IsPalidDromeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
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
    
     @Test
     public boolean isPalindrome(int  digit)
     {
        digit = 7;
        boolean result;
        result =Paliddrome.isPalindrome(digit);
        assertTrue(result);
        return result;
        // copied digit into variable
     }
     
     
    @Test 
   private static void assertTrue(boolean result) 
    {
        if(result== false)
        {
               fail ( "Not palidDrome" );
        }
        else
        {
            
            System.out.println("Palindrome true");
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

