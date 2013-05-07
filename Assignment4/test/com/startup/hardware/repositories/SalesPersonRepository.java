/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repositories;

import com.startup.hardware.app.factory.AbstractFactory;
import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.app.factory.PersonFactory;
import com.startup.hardware.model.Address;
import com.startup.hardware.model.Contact;
import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.User1;
import com.startup.hardware.service.crud.PersonCrud;
import com.startup.hardware.service.crud.SalesPersonCrud;
import com.startup.hardware.service.crud.UserCrud;
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
public class SalesPersonRepository {
    
    
    private Long id;
    private ApplicationContext ctx;
    private SalesPersonCrud  salePersonCrud;
    private UserCrud   userCrud;
    private PersonCrud personCrud;
    
    public SalesPersonRepository() 
    {
         ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
    @Test
    public  void  testStoreCustomerCrud()
    {
         personCrud=(PersonCrud)ctx.getBean("PersonCrud");
         salePersonCrud=(SalesPersonCrud)ctx.getBean("SalesPersonCrud");
         Map<String,String> personValues=new HashMap<String,String>();
         personValues.put("firstName", "WalliedDaniels");
         personValues.put("lastName", "Daniels");
         personValues.put("dateOfBirth","04-feb-1990");
         personValues.put("middelName", "Grobler");
         personValues.put("gender", "male");
         PersonFactory personFactory =AbstractFactory.getPersonFactory("salesPerson");
         
         Contact contact=AppFactory.getContact("Grobler.abubaker@gmail","0736487777","0219981888","021999999");
         Address address;
         address = AppFactory.getAddress("18 Hexidecimal Road bellville","17Hexidecimal Road bellville","9488");
         User1    user=personFactory.getUser("Amlan","kanman");
         userCrud=(UserCrud)ctx.getBean("UserCrud");
         userCrud.persist(user);
         List<Address> listAddress=new ArrayList<Address>();
         listAddress.add(address);
         LessonParameters lesson;
         lesson = new LessonParameters(contact,listAddress,user);
         Person person;
         person = personFactory.getPerson(personValues, lesson);
         
         Map<String,String>  salePvalues=new HashMap<String,String>();
         salePvalues.put("daily_SalesHandled","10");
         salePvalues.put("hisMonthTurnOver", "9000");
         salePvalues.put("temp", "true");
         salePvalues.put("fullTime","true");
         SalesPerson salesPerson=personFactory.getSalesPerson(salePvalues, person);
         
         salePersonCrud.persist(salesPerson);
         id= person.getId();
         Assert.assertNotNull(id,"Testing Persisted Entity");
        
        // salePersonCrud.remove(salesPerson);

         //Test tyo see if We have Deleted 
      //   SalesPerson salesPerson1 =  salePersonCrud.findById(person.getId());
      //   Assert.assertNull(salesPerson1,"Testing for Deleted Sales Person" ); 
         
         
    }
    
}
