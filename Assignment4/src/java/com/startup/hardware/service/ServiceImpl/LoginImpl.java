/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.ServiceImpl;


import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.model.User1;
import com.startup.hardware.service.Service.LoginService;
import com.startup.hardware.service.crud.SalesPersonCrud;
import com.startup.hardware.service.crud.StoreCustomerCrud;
import com.startup.hardware.service.crud.SupervisorCrud;
import com.startup.hardware.service.crud.UserCrud;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Wallied
 */

public class LoginImpl implements LoginService
{
  
    private  ApplicationContext  ctx;
    private  static  LoginImpl   loginImpl=null;
    private  String  userNames;
    private  String  passWords;
    private  UserCrud  userCrud;

    
    
    private LoginImpl()
    {
         ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
    }
    public   static   LoginImpl  getInstance()
    {
         if(loginImpl == null)
         {
             
             loginImpl= new LoginImpl();
         }
        return  loginImpl;
    }
    
    public boolean loginSupervisor(String passWrd,String user1Name) 
    {
       
         userCrud=(UserCrud)ctx.getBean("UserCrud");
      
         for(long i=1; i < userCrud.count();i++)
         {
             
           User1 user1=userCrud.findById(i);
           
           passWords=user1.getPassWord();
           userNames=user1.getUserName();
             if( passWords.equalsIgnoreCase(passWrd))
             {
                 if(userNames.equalsIgnoreCase(user1Name))
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
    public boolean loginSalesPerson(String password,String username) 
    {
       userCrud=(UserCrud)ctx.getBean("UserCrud");
      
         for(long i=1; i < userCrud.count();i++)
         {
             
           User1 user1=userCrud.findById(i);
           
           passWords=user1.getPassWord();
           userNames=user1.getUserName();
             if( passWords.equalsIgnoreCase(password))
             {
                 if(userNames.equalsIgnoreCase(username))
                 {
                     
                     return  true;
                     
                 }
             }
        
         }
        return false;  
    }

    public boolean loginCustomer(String password,String username)
    {
        userCrud=(UserCrud)ctx.getBean("UserCrud");
      
         for(long i=1; i < userCrud.count();i++)
         {
             
           User1 user1=userCrud.findById(i);
           
           passWords=user1.getPassWord();
           userNames=user1.getUserName();
             if( passWords.equalsIgnoreCase(password))
             {
                 if(userNames.equalsIgnoreCase(username))
                 {
                     
                     return  true;
                     
                 }
             }
        
         }
        return false;

     }
    
}
