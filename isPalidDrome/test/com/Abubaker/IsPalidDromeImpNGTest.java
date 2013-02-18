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
    
    private IsPalidDrome palid;
    private  ArrayAssert assertArray;
  
            
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
        assertArray=new ArraysAssertImp();
        
       // assertArray.displayListContent(listWanted);
        
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
        boolean expResult = true;
        boolean result = palid.isPalindrome(digit);
        assertTrue(result);
       
    }
    
    @Test
    public void testIsNotPalindrome() 
    {
        System.out.println("isNotPalindrome");
        int digit = 41;
        boolean expResult = false;
        boolean result = palid.isNotPalindrome(digit);
        assertFalse(result);    
    }
    
    @Test
    public void testPalidDromeReturn() 
    {
        
        int  digit=700;
        boolean expResult = false;
        IsPalidDromeImp result;
        result = palid.ObjectPalidreturn(digit);
        assertNotNull(result);    
    }
    @Test
    public void displayListContent(String listWanted[]) throws Exception
    {
       String[] actual =new String[]{"Spur Ribs","T bone Steak","Big Mac Burger"};

       String[] var=new String[]{"Pizza","Rave Burger","Corner Boys"};
       for(int i=0; i < actual.length;i++)
       {
         assertEquals("Two arrays should contain same content",actual[i],var[i]);
       }
    }

   

}
