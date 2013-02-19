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
    
    private static IsPalidDrome palid;
   
  
            
    public IsPalidDromeImpNGTest() 
    {
        
    }

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public  void setUpClass() throws Exception
    {
      
        palid=new IsPalidDromeImp();
        
        
                
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
    public void testPalidDromeReturn() 
    {
        int  digit=700;
        boolean expResult = false;
        IsPalidDromeImp result;
        result = palid.ObjectPalidreturn(digit);
        assertNotNull(result);    
    }
 
}
