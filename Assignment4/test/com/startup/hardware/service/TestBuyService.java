/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.Invoice1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.service.Service.BuyService;
import com.startup.hardware.service.ServiceImpl.BuyServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Wallied
 */
public class TestBuyService {
    
    
    private    BuyService     service;
  
    
    public TestBuyService() 
    {
          service=  BuyServiceImpl.getInstance();
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBuy()
    {
          List<ItemSpecific> all=new ArrayList<ItemSpecific>();
          Map<String,String> values=new HashMap<String,String>();
          values.put("model","ba");
          values.put("Item_ID","2");
          values.put("sizes","12");
          values.put("Price","210");
          values.put("Description","Water pype");
          values.put("name","solid works");
          ItemSpecific itemSpecific=AppFactory.getItemSpecific(values);
          Invoice1 buy = service.buy(all, null, null);
          
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
}
