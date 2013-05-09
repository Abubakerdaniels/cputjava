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
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.model.User1;
import com.startup.hardware.service.crud.PersonCrud;
import com.startup.hardware.service.crud.SupervisorCrud;
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
public class SupervisorRepository {
    
    private SupervisorCrud  supervisorCrud;
    private Long  id;
    private static ApplicationContext ctx;
    private PersonCrud personCrud; 
    
    public SupervisorRepository() 
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
    public void testSupervisor()
    {
         personCrud=(PersonCrud)ctx.getBean("PersonCrud");
         supervisorCrud=(SupervisorCrud)ctx.getBean("SupervisorCrud");
         
         Map<String,String> personValues=new HashMap<String,String>();
         personValues.put("firstName", "Abubaker");
         personValues.put("lastName", "Daniels");
         personValues.put("dateOfBirth","01-Jan-1990");
         personValues.put("middelName", "Sidiek");
         personValues.put("gender", "male");
        
         Contact contact=AppFactory.getContact("daniels.abubaker@gmail","0736480130","0219981234","021999111");
         Address address=AppFactory.getAddress("17 Hexidecimal Road bishop","17 Hexidecimal Road bishop","7488");
         User1    user=AppFactory.getUser("Amlan","kanman");
         List<Address> listAddress=new ArrayList<Address>();
         listAddress.add(address);
         LessonParameters lesson;
         lesson = new LessonParameters(contact,listAddress,user);
         Person person;
         person = AppFactory.getPerson(personValues, lesson);
         Supervisor supervisor=AppFactory.getSupervisor("Delivery","Transport", person);
     
         
          supervisorCrud.persist(supervisor);
         id= person.getId();
         Assert.assertNotNull(id,"Testing Persisted Entity");
        
         supervisorCrud.remove(supervisor);

         //Test tyo see if We have Deleted 
         Supervisor supervisor1 = supervisorCrud.findById(person.getId());
         Assert.assertNull(supervisor1,"Testing for Deleted Supervisor" ); 
         
    }
}
