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
public class AssertIntegerImpNGTest {
 
    private static  AssertInteger  assertInt;
            
    public AssertIntegerImpNGTest() 
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        assertInt=new AssertIntegerImp();
        testSetStockRecieved();
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
     * Test of getStockRecieved method, of class AssertIntegerImp.
     */
    @Test
    public void testGetStockRecieved() {
        System.out.println("getStockRecieved");
       
        int stockOrdered = 6;
        int received= assertInt.getStockRecieved();
        assertEquals(received, stockOrdered );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStockRecieved method, of class AssertIntegerImp.
     */
    @Test
    public static void testSetStockRecieved() 
    {
        System.out.println("setStockRecieved");
        int recieved = 6;
        assertInt.setStockRecieved(recieved);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
