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
public class AssertFailImpNGTest 
{
    private static AssertFail fail1;
    private static ApplicationContext  ctx;
    public AssertFailImpNGTest() 
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        //
        //</editor-fold>
        fail1=(AssertFail)ctx.getBean("Fail");
       
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
      
        fail1.timer(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
