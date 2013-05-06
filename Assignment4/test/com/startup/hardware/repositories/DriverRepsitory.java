/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repositories;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.DeffectedItems;
import com.startup.hardware.model.Driver;
import com.startup.hardware.service.crud.DriverCrud;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Wallied
 */
public class DriverRepsitory {
    
    
    private DriverCrud driverCrud;
    private static ApplicationContext  ctx;    
    private Long id;
    
    public DriverRepsitory()
    {
        
    }
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
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
    public void testDriverCrud() 
    {
       
        driverCrud=(DriverCrud)ctx.getBean("DriverCrud");
        Map<String,String> driverValues=new HashMap<String,String>();
        driverValues.put("route", "Belhar");
        driverValues.put("km_Driven", "200");
        driverValues.put("petrol_Used","50");
        driverValues.put("gPRSAllocated","true");
        Driver driver=AppFactory.getDriver(driverValues);      
        
        driverCrud.persist(driver);
        id= driver.getId();
        Assert.assertNotNull(id,"Testing Persisted Entity");
        
        driverCrud.remove(driver);

        //Test tyo see if We have Deleted 
        Driver driver1 = driverCrud.findById(id);
        Assert.assertNull(driver1,"Testing for Deleted DriverItem" ); 
    }
}
