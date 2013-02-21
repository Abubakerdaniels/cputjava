/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Daniels.Assignment;

import com.Daniels.Assignment.AssertFloatImp;
import com.Daniels.Assignment.AssertFloat;
import static org.testng.Assert.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Abu
 */
public class AssertFloatImpNGTest {
    private static AssertFloat overviewAverage;
    public AssertFloatImpNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        overviewAverage=new AssertFloatImp();
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
    public void testSomeMethod()
    {
        // TODO review the generated test code and remove the default call to fail.
        float averaGe=overviewAverage.average(257);
        float exspected=64;
        float tolerance=1;
        //<editor-fold defaultstate="collapsed" desc="comment">
        Assert.assertEquals(averaGe,exspected,tolerance);
                //</editor-fold>
         
       // fail("The test case is a prototype.");
    }
}
