/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.app.factory;

import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Address;
import com.startup.hardware.model.Contact;
import com.startup.hardware.model.DeffectedItems;
import com.startup.hardware.model.Driver;
import com.startup.hardware.model.Inventory;
import com.startup.hardware.model.Invoice1;
import com.startup.hardware.model.Item1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.Sales;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.model.User;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Wallied
 */
public class AppFactory
{
      public  static  Address  getAddress(String postalAddress,String physicalAddress,String  postalCode)
      {
          Address address=new Address();
          address.setPhysicalAddress(physicalAddress);
          address.setPostalAddress(postalAddress);
          address.setPostalCode(postalCode);
          return address;
      }
      
      public static Contact  getContact(String emailAddress,String lastName1,String middelName,String gender)
      {
            Contact  contact=new Contact();
            contact.setEmailAddress(emailAddress);
            contact.setGender(gender);
           
           
            return  contact;
      }
      
      public  static  DeffectedItems    getDeffectedItems(Map<String,String> values,ItemSpecific itemSpecification)
      {
            DeffectedItems  deffectedItems=new DeffectedItems(); 
            return  deffectedItems;
      }
      
      public   static  ItemSpecific getItemSpecific( Map<String,String>  values)
      {
       
          ItemSpecific itemSpecific=new ItemSpecific();
          itemSpecific.setDescription(values.get("Description"));
          itemSpecific.setItem_ID(Integer.parseInt(values.get("Item_ID")));
          itemSpecific.setModel(values.get("model"));
          itemSpecific.setName(values.get("name"));
          itemSpecific.setPrice(Double.parseDouble(values.get("Price")));
          itemSpecific.setSizes(Integer.parseInt(values.get("sizes")));
          return  itemSpecific;
          
      }
      
      public  static Driver getDriver(Map<String,String> values)
      {
          Driver  driver=new Driver();
          driver.setDriven_km(Double.parseDouble(values.get("km_Driven")));
          driver.setPetrol_Used(Double.parseDouble(values.get("petrol_Used")));
          driver.setRoute(values.get("route"));
          driver.setgPRSAllocated(Boolean.parseBoolean(values.get("gPRSAllocated")));
          return  driver;
      }
      
      public  static Inventory  getInventory(int stockQuantity,String stockLocation)
      {
          Inventory  inventory=new Inventory();
          inventory.setStockLocation(stockLocation);
          inventory.setStockQuantity(stockQuantity);
          return  inventory;
      }
      
    @SuppressWarnings({"deprecation", "deprecation"})
      public  static Invoice1  getInvoice(Map<String,String> values)
      {
            Invoice1 invoice=new Invoice1();
            invoice.setCompanyTo(values.get("companyTo"));
            invoice.setDatePrinteds(new Date());
            invoice.setSupplier(values.get("supplier"));
            return  invoice; 
      }
      public static Item1 getItem(List<ItemSpecific> itemSpecific)
      {
          Item1 item=new Item1();
          item.setItemSpecific(itemSpecific);
          return item;
          
      }
      
    @SuppressWarnings({"deprecation", "deprecation"})
      public static   Person getPerson(Map<String,String> values,LessonParameters  lesson)
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
    
      public static  User getUser(String userName,String passWord )
      {
         User user=new User();
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
      public static  SalesPerson getSalesPerson(Map<String,String>  values,Person person)
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
   
    public  static   Sales  getSales(double proceedPerYear,double proceedPerMonth)
    {
          Sales  sales=new Sales();
          sales.setProceedPerMonth(proceedPerMonth);
          sales.setProceedPerYear(proceedPerYear);
          return  sales;     
    }
    public  static  StoreCustomer  getStoreCustomers(double credit,String company_Name ,Person person)
    {  
        StoreCustomer storeCustomer=new StoreCustomer();
        storeCustomer.setPerson(person);
        storeCustomer.setCompany_Name(company_Name);
        storeCustomer.setCredit(credit);
        return storeCustomer;
    }
    public  static  Supervisor  getSupervisor(String responsibilty,String department,Person person)
    {
        Supervisor supervisor=new Supervisor();
        supervisor.setResponsibility(responsibilty);
        supervisor.setDepartment(department);
        supervisor.setPerson(person);
        return supervisor;
    }
}
