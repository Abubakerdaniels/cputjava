/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repositories;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.Address;
import com.startup.hardware.model.Contact;
import com.startup.hardware.model.User1;
import com.startup.hardware.service.crud.PersonCrud;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.service.Impl.UserCrudImpl;
import com.startup.hardware.service.crud.AddressCrud;
import com.startup.hardware.service.crud.ContactCrud;
import com.startup.hardware.service.crud.UserCrud;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
/**
 *
 * @author Wallied
 */
public class PersonRepository {
    private Long id;
    private PersonCrud   personCrud;
    private AddressCrud  addressCrud;
    //private ContactCrud  contactCrud;
    private UserCrud  userCrud;
    private static  ApplicationContext  ctx;
    
    
    public PersonRepository() 
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
    /**/
    @Test
    public void testPersonCrud()
    {
         personCrud=(PersonCrud)ctx.getBean("PersonCrud");
         addressCrud=(AddressCrud)ctx.getBean("AddressCrud");
        // contactCrud=(ContactCrud)ctx.getBean("ContactCrud");
         userCrud =(UserCrud)ctx.getBean("UserCrud");
         Map<String,String> personValues=new HashMap<String,String>();
         personValues.put("firstName", "Abubaker");
         personValues.put("lastName1", "Daniels");
         personValues.put("dateOfBirth","01-Jan-1990");
         personValues.put("middelName", "Sidiek");
         personValues.put("gender", "male");
        
         Contact contact=AppFactory.getContact("daniels.abubaker@gmail","0736480130","0219981234","021999111");
      //   contactCrud.persist(contact);
         Address address=AppFactory.getAddress("17 Hexidecimal Road bishop","17 Hexidecimal Road bishop","7488");
         addressCrud.persist(address);
         User1    user=AppFactory.getUser("Amlan","kanman");
         userCrud.persist(user);
         List<Address> listAddress=new ArrayList<Address>();
         listAddress.add(address);
         LessonParameters lesson;
         lesson = new LessonParameters(contact,listAddress,user);
         Person person;
         person = AppFactory.getPerson(personValues, lesson);
         
         
         personCrud.persist(person);
         id= person.getId();
         Assert.assertNotNull(id,"Testing Persisted Entity");
        
       // personCrud.remove(person);

        // Test tyo see if We have Deleted 
        // Person person1 =  personCrud.findById(person.getId());
        // Assert.assertNull(person1,"Testing for Deleted Person" ); 
         
    }
}
