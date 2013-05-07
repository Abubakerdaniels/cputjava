/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service;

import com.startup.hardware.app.factory.AbstractFactory;
import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.app.factory.PersonFactory;
import com.startup.hardware.model.Address;
import com.startup.hardware.model.Contact;
import com.startup.hardware.model.Invoice1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.User1;
import com.startup.hardware.service.Service.BuyService;
import com.startup.hardware.service.ServiceImpl.BuyServiceImpl;
import com.startup.hardware.service.crud.UserCrud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
    
    private    UserCrud  userCrud;
    private    BuyService     service;
    private    ApplicationContext  ctx;
    
    public TestBuyService() 
    {
          service=  BuyServiceImpl.getInstance();
          ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
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
          all.add(itemSpecific);
          
          
          
          Map<String,String> personValues=new HashMap<String,String>();
         personValues.put("firstName", "Abubaker");
         personValues.put("lastName1", "Daniels");
         personValues.put("dateOfBirth","01-Jan-1990");
         personValues.put("middelName", "Sidiek");
         personValues.put("gender", "male");
        
         Contact contact=AppFactory.getContact("daniels.abubaker@gmail","0736480130","0219981234","021999111");
         Address address=AppFactory.getAddress("17 Hexidecimal Road bishop","17 Hexidecimal Road bishop","7488");
         
         User1    user=AppFactory.getUser("Amlan","kanman");
         List<Address> listAddress=new ArrayList<Address>();
         listAddress.add(address);
         LessonParameters lesson;
       
        
        
         userCrud=(UserCrud)ctx.getBean("UserCrud");
         userCrud.persist(user);
         lesson = new LessonParameters(contact,listAddress,user);
         Person person;
         person = AppFactory.getPerson(personValues, lesson);
         
         
         Map<String,String>  salePvalues=new HashMap<String,String>();
         salePvalues.put("daily_SalesHandled","10");
         salePvalues.put("hisMonthTurnOver", "9000");
         salePvalues.put("temp", "true");
         salePvalues.put("fullTime","true");
          
         PersonFactory personFactory=AbstractFactory.getPersonFactory("salesPerson");
         SalesPerson  salesP=personFactory.getSalesPerson(salePvalues, person);
         Long id=Long.parseLong("1");
         salesP.setId(id);
         Invoice1 buy = service.buy(all,salesP, null);
          
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
