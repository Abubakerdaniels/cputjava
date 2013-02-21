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
public class AssertIntegerImpNGTest {
 
    private static  AssertInteger  assertInt;
    private static  ApplicationContext ctx;       
    public AssertIntegerImpNGTest() 
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        //
        //</editor-fold>
        assertInt=(AssertInteger)ctx.getBean("Integer");
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
