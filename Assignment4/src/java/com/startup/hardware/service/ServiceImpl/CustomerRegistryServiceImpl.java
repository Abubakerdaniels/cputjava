/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.ServiceImpl;

import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.service.Service.CustomerRegistryService;
import com.startup.hardware.service.crud.InvoiceCrud;
import com.startup.hardware.service.crud.ItemCrud;
import com.startup.hardware.service.crud.ItemSpecificCrud;
import com.startup.hardware.service.crud.SalesPersonCrud;
import com.startup.hardware.service.crud.StoreCustomerCrud;
import com.startup.hardware.service.crud.UserCrud;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Wallied
 */
public class CustomerRegistryServiceImpl  implements CustomerRegistryService {

    
    private   StoreCustomerCrud  storeCustomerCrud;
           
    private    static  CustomerRegistryServiceImpl  customerRegistryServiceImpl=null;
    private    InvoiceCrud  invoiceCrud;
    private    ItemCrud   itemCrud;
    private    ItemSpecificCrud  itemSpecificCrud;
    private    SalesPersonCrud   salesPersonCrud;
    private    ApplicationContext ctx;
    private    UserCrud  userCrud;
    //private    StoreCustomerCrud    storeCustomerCrud;
    
    
    
    private  CustomerRegistryServiceImpl()
    {
      ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
    }
    public  static CustomerRegistryServiceImpl  getInstance()
    {
               if(customerRegistryServiceImpl == null)
               {
                  customerRegistryServiceImpl=new CustomerRegistryServiceImpl();   
               }
               
               return  customerRegistryServiceImpl;  
    }
    public StoreCustomer createCustomer(StoreCustomer storeCustomer) 
    {
         return      new StoreCustomer();
    }
    
}
