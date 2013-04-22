/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.model.User;
import com.startup.hardware.service.Service.LoginService;
import com.startup.hardware.service.crud.SalesPersonCrud;
import com.startup.hardware.service.crud.StoreCustomerCrud;
import com.startup.hardware.service.crud.SupervisorCrud;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Wallied
 */

public class LoginImpl implements LoginService
{
    private  SupervisorCrud      superVisorCrud;
    private  SalesPersonCrud     salesPersonCrud;
    private  ApplicationContext  ctx;
    private  StoreCustomerCrud   storeCustomerCrud;
    
    
    public LoginImpl()
    {
         ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
    }
    public boolean loginSupervisor(Supervisor salesPerson) 
    {
       superVisorCrud=(SupervisorCrud)ctx.getBean("SupervisorCrud");
       List<Supervisor> allSalesPerson=superVisorCrud.findAll();
       for(int i=0; i < allSalesPerson.size();i++)
       {
             Person person= allSalesPerson.get(i).getPerson();
             User user=person.getUser();
             if(user.getPassWord().equalsIgnoreCase(salesPerson.getPerson().getUser().getPassWord()))
             {
                 if(user.getUserName().equalsIgnoreCase(salesPerson.getPerson().getUser().getUserName()))
                 {
                     
                     return  true;
                     
                 }
             }
       }
       return false;
    }

    /**
     *
     * @param salesPerson
     * @return
     */
    public boolean loginSalesPerson(SalesPerson salesPerson) 
    {
        salesPersonCrud = (SalesPersonCrud)ctx.getBean("SalesPersonCrud");
        List<SalesPerson> allSalesPerson=salesPersonCrud.findAll();
        for(int i=0; i < allSalesPerson.size();i++)
       {
             Person person= allSalesPerson.get(i).getPerson();
             User user;
             user = person.getUser();
             if(user.getPassWord().equalsIgnoreCase(salesPerson.getPerson().getUser().getPassWord()))
             {
                 if(user.getUserName().equalsIgnoreCase(salesPerson.getPerson().getUser().getUserName()))
                 {
                     
                     return  true;
                     
                 }
             }
       }
       return false;
        
    }

    public boolean loginCustomer(StoreCustomer customer)
    {
        storeCustomerCrud =(StoreCustomerCrud)ctx.getBean("StoreCustomerCrud");
        List<StoreCustomer> allCustomer=storeCustomerCrud.findAll();
         for(int i=0; i < allCustomer.size();i++)
         {
             Person person= allCustomer.get(i).getPerson();
             User user;
             user = person.getUser();
             if(user.getPassWord().equalsIgnoreCase(customer.getPerson().getUser().getPassWord()))
             {
                 if(user.getUserName().equalsIgnoreCase(customer.getPerson().getUser().getUserName()))
                 {
                     return  true;
                 }
             }
         }
         return false;
     }
    
}
