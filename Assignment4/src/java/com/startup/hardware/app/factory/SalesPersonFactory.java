/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.app.factory;

import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.Sales;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.model.User1;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Wallied
 */


public class SalesPersonFactory  implements  PersonFactory
{
      private   static   SalesPersonFactory   salesPersonFactory=null;
      
      private SalesPersonFactory()
      {
          
      }
      
      public   static   SalesPersonFactory  getInstance()
      {
            if(salesPersonFactory == null)
            {
               salesPersonFactory=new SalesPersonFactory();   
            }
            
         return  salesPersonFactory;
      }
      
       @SuppressWarnings({"deprecation", "deprecation"})
      public   Person getPerson(Map<String,String>  values,LessonParameters  lesson)
      {
          Person person=new Person();
          person.setDateOfBirth(new Date(Date.parse(values.get("dateOfBirth"))));
          person.setFirstName(values.get("firstName"));
          person.setGender(values.get("gender"));
          person.setLastName(values.get("lastName1"));
          person.setMiddelName("middelName");
          person.setAddress(lesson.getAddress());
          person.setContact(lesson.getContact());
          person.setUser(lesson.getUser());
          return person;
      }
    
      public   User1 getUser(String userName,String passWord )
      {
         User1 user=new User1();
         user.setPassWord(passWord);
         user.setUserName(userName);
         return user;
      }
      /**
     *
     * @param person
     * @param salesPPerson
     * @return
     */
      public  SalesPerson getSalesPerson(Map<String,String>  values,Person person)
      {
          
          SalesPerson salesP;
          salesP = new SalesPerson();
          salesP.setDaily_SalesHandled(Integer.parseInt(values.get("daily_SalesHandled")));
        
          if(values.get("fullTime").equalsIgnoreCase("true"))
          {
            salesP.setFullTIme(true);
           
          }
          else
          {
               salesP.setFullTIme(false);
          }
          
          
          if(values.get("temp").equalsIgnoreCase("true"))
          {
                salesP.setTemp(true);
          }
          else
          {
                salesP.setTemp(false);
          }
          salesP.setHisMonthTurnOver(Double.parseDouble(values.get("hisMonthTurnOver")));
         
          salesP.setPerson(person);
 
          return salesP;
      }
   
    public    Sales  getSales(double proceedPerYear,double proceedPerMonth)
    {
          Sales  sales=new Sales();
          sales.setProceedPerMonth(proceedPerMonth);
          sales.setProceedPerYear(proceedPerYear);
          return  sales;     
    }
    /**
     *
     * @param credit
     * @param company_Name
     * @param person
     * @return
     */
    @Override
    public    StoreCustomer  getStoreCustomers(double credit,String company_Name ,Person person)
    {  
        StoreCustomer storeCustomer=new StoreCustomer();
        storeCustomer.setPerson(person);
        storeCustomer.setCompany_Name(company_Name);
        storeCustomer.setCredit(credit);
        return storeCustomer;
    }
    public    Supervisor  getSupervisor(String responsibilty,String department,Person person)
    {
        Supervisor supervisor=new Supervisor();
        supervisor.setResponsibility(responsibilty);
        supervisor.setDepartment(department);
        supervisor.setPerson(person);
        return supervisor;
    }
}
