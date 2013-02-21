/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Daniels.Assignment;

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
public class AssertFailImpNGTest 
{
    private static AssertFail fail1;
    public AssertFailImpNGTest() 
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        fail1=new AssertFailImp();
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
     * Test of timer method, of class AssertFailImp.
     */
    @Test
    public void testTimer()
    {
        System.out.println("timer");
        int time = 20;
        AssertFailImp instance = new AssertFailImp();
        fail1.timer(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
