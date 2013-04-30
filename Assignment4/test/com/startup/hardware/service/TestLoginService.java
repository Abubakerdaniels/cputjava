/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service;

import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.service.Impl.LoginImpl;
import com.startup.hardware.service.Service.LoginService;
import com.startup.hardware.service.Service.LoginSupervisor;
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
public class TestLoginService 
{
    private   static  TestLoginService   testLogin;
    private   String  passWord;
    private   String  userName;
    private   static LoginService service;
            
    private TestLoginService() 
    {
        
    }
    
    public   synchronized   static  TestLoginService  instance()
    {
        if(testLogin == null)
        {
              testLogin=new   TestLoginService();
        }
        return  testLogin;
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSupervisorLogin() 
     {
         service=LoginSupervisor.instance();
         Supervisor  supervisor;
         passWord="gold";
         userName="gold";
         
        
         boolean access;
         access = service.loginSupervisor(passWord,userName);
         Assert.assertTrue(access,"Login Denied Supervisor");
         
     }
     /**
     *
     */
    //@Test
     public  void testLoginSalesPerson()
     {
         
         SalesPerson salesPerson=new SalesPerson();
         Person person = new Person();
         passWord="Silver";
         userName="Silver";
         salesPerson.setPerson(person);
         salesPerson.getPerson().getUser().setPassWord(passWord);
         salesPerson.getPerson().getUser().setUserName(userName);
         boolean access;
         access = service.loginSalesPerson(salesPerson);
         Assert.assertTrue(access,"Login Denied Sales Person");
         
     }
    //@Test 
    public  void   testLoginCustomer()
    {
          StoreCustomer customer=new  StoreCustomer();
          Person person=new Person();
          passWord="bronze";
          userName="bronze";
          customer.setPerson(person);
          customer.getPerson().getUser().setPassWord(passWord);
          customer.getPerson().getUser().setUserName(userName);
          boolean access;
          access = service.loginCustomer(customer);
          Assert.assertTrue(access,"Login Denied Customer");
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
          service=new LoginImpl();
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
