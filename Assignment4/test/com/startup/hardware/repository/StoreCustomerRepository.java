/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repository;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.Address;
import com.startup.hardware.model.Contact;
import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.User;
import com.startup.hardware.service.crud.AddressCrud;
import com.startup.hardware.service.crud.ContactCrud;
import com.startup.hardware.service.crud.PersonCrud;
import com.startup.hardware.service.crud.StoreCustomerCrud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class StoreCustomerRepository 
{
    private StoreCustomerCrud storeCustomer;
    private ContactCrud  contactCrud;
    private AddressCrud  addressCrud;
    private long id;
    private static ApplicationContext  ctx;
    private PersonCrud personCrud;
            
    public StoreCustomerRepository() 
    {
        
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
    public  void   testStoreCustomer()
    {
         personCrud=(PersonCrud)ctx.getBean("PersonCrud");
         contactCrud=(ContactCrud)ctx.getBean("ContactCrud");
         storeCustomer=(StoreCustomerCrud)ctx.getBean("StoreCustomerCrud");
         contactCrud=(ContactCrud)ctx.getBean("ContactCrud");
         addressCrud=(AddressCrud)ctx.getBean("AddressCrud");
        
         Map<String,String> personValues=new HashMap<String,String>();
         personValues.put("firstName", "Abubaker");
         personValues.put("lastName", "Daniels");
         personValues.put("dateOfBirth","01-Jan-1990");
         personValues.put("middelName", "Sidiek");
         personValues.put("gender", "male");
        
         Contact contact=AppFactory.getContact("daniels.abubaker@gmail","0736480130","0219981234","021999111");
         Address address=AppFactory.getAddress("17 Hexidecimal Road bishop","17 Hexidecimal Road bishop","7488");
         addressCrud.persist(address);
         contactCrud.persist(contact);
         
         User    user=AppFactory.getUser("Amlan","kanman");
         List<Address> listAddress=new ArrayList<Address>();
         listAddress.add(address);
         LessonParameters lesson;
         lesson = new LessonParameters(contact,listAddress,user);
         Person person;
         person = AppFactory.getPerson(personValues, lesson);
         StoreCustomer cusomer=AppFactory.getStoreCustomers(900,"Tini Pi", person);
       
         personCrud.persist(person);
         storeCustomer.persist(cusomer);
         id= person.getId();
         Assert.assertNotNull(id,"Testing Persisted Entity");
         storeCustomer.remove(cusomer);

         //Test tyo see if We have Deleted 
         StoreCustomer customer =  storeCustomer.findById(person.getId());
         Assert.assertNull(customer,"Testing for Deleted Customer" ); 
         
    }
}
