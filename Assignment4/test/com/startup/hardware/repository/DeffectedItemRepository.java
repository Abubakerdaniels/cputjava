/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repository;


import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.DeffectedItems;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.service.crud.DeffectedItemsCrud;
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
public class DeffectedItemRepository {
    
    private  DeffectedItemsCrud   deffectedItemsCrud;
    private  Long  id;
    private static ApplicationContext ctx;

    
    public DeffectedItemRepository() 
    {
        
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception
    {
         ctx = new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
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
     public void testDeffectedItemCrud()
     {
         
        deffectedItemsCrud = (DeffectedItemsCrud) ctx.getBean("DeffectedItemsCrud");
        Map<String,String>  itemSpecificationValues=new HashMap<String,String>();
        itemSpecificationValues.put("model","Za");
        itemSpecificationValues.put("Item_ID","1");
        itemSpecificationValues.put("sizes","10");
        itemSpecificationValues.put("Price","910");
        itemSpecificationValues.put("Description","WaterProof paint");
        itemSpecificationValues.put("name","V&A");
        ItemSpecific itemSpecification= AppFactory.getItemSpecific(itemSpecificationValues);
    
        
        Map<String, String> DeffectedItemsDetails = new HashMap<String, String>();
        DeffectedItemsDetails.put("supplierName", "BuilderWareHouse");
        DeffectedItemsDetails.put("reasonForDefect", "Paint mix to thick");
        DeffectedItemsDetails.put("isRepairable", "true");
        DeffectedItemsDetails.put("isRefundable", "true");
        DeffectedItemsDetails.put("isCoveredInsured", "false");
        
        DeffectedItems deffectedItems=AppFactory.getDeffectedItems(DeffectedItemsDetails, itemSpecification);
  
   
        deffectedItemsCrud.persist(deffectedItems);
        id= deffectedItems.getId();
        Assert.assertNotNull(id,"Testing Persisted Entity");
        
        deffectedItemsCrud.remove(deffectedItems);

        //Test tyo see if We have Deleted 
        DeffectedItems defect = deffectedItemsCrud.findById(deffectedItems.getId());
        Assert.assertNull(defect,"Testing for Deleted DeffectedItem" ); 
     }
}
