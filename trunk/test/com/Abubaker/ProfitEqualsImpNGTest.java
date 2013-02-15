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
public class ProfitEqualsImpNGTest 
{
    private ProfitEquals equals;
    
    public ProfitEqualsImpNGTest() {
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
     * Test of profitPersentage method, of class ProfitEqualsImp.
     */
    @Test
    public void testProfitPersentage() {
        
        
        System.out.println("profitPersentage");
        double totalIncome = 17250;
        double totalCost = 15000;
        ProfitEqualsImp instance = new ProfitEqualsImp();
        double expResult = 15.0;
        double result = instance.profitPersentage(totalIncome, totalCost);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
