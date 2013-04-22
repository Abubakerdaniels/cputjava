/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repository;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.Item1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.service.crud.ItemCrud;
import com.startup.hardware.service.crud.ItemSpecificCrud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class ItemRepository
{   
    private ItemCrud  itemCrud;
    private ItemSpecificCrud  itemSpec1;
    private static ApplicationContext  ctx;    
    private Long id;
    
    public ItemRepository() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
    public void testItemCrud()
    {
        itemCrud=(ItemCrud)ctx.getBean("ItemCrud");
        List<ItemSpecific> itemSpec=new ArrayList<ItemSpecific>();
        HashMap<String,String>  itemSpecificationValues=new HashMap<String,String>();
        itemSpecificationValues.put("model","ba");
        itemSpecificationValues.put("Item_ID","2");
        itemSpecificationValues.put("sizes","12");
        itemSpecificationValues.put("Price","210");
        itemSpecificationValues.put("Description","Water pype");
        itemSpecificationValues.put("name","solid works");
        ItemSpecific itemspec=AppFactory.getItemSpecific(itemSpecificationValues);
        itemSpec.add(itemspec);
        itemSpec1=(ItemSpecificCrud)ctx.getBean("ItemSpecificCrud");
        itemSpec1.persist(itemspec);
        Item1  item=AppFactory.getItem(itemSpec);
        
        itemCrud.persist(item);
        id= item.getId();
        Assert.assertNotNull(id,"Testing Persisted Entity");
        
         itemCrud.remove(item);
         

        //Test tyo see if We have Deleted 
        Item1 item1 =  itemCrud.findById(item.getId());
        Assert.assertNull(item1,"Testing for Deleted Item" ); 
    }
}
