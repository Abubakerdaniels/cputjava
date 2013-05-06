/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.ServiceImpl;

import com.startup.hardware.model.Invoice1;
import com.startup.hardware.model.Item1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.service.Service.BuyService;
import com.startup.hardware.service.crud.InvoiceCrud;
import com.startup.hardware.service.crud.ItemCrud;
import com.startup.hardware.service.crud.ItemSpecificCrud;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//import  com.startup.hardware.repositories.
/**
 *
 * @author Wallied
 */
public class BuyServiceImpl implements BuyService 
{
    private    static  BuyServiceImpl  buyServiceImpl=null;
    private    InvoiceCrud  invoiceCrud;
    private    ItemCrud   itemCrud;
    private    ItemSpecificCrud  itemSpecificCrud;
    private    ApplicationContext ctx;
    
    private  BuyServiceImpl()
    {
      ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
    }
    public  static BuyServiceImpl  getInstance()
    {
               if(buyServiceImpl == null)
               {
                  buyServiceImpl=new BuyServiceImpl();   
               }
               
               return  buyServiceImpl;  
    }
    
    public Invoice1 buy(List<ItemSpecific> item1, SalesPerson salesPerson,StoreCustomer customer)
    {
        Invoice1  invoice=new Invoice1();
       
        invoiceCrud=(InvoiceCrud) ctx.getBean("InvoiceCrud");
        itemSpecificCrud=(ItemSpecificCrud)ctx.getBean("ItemSpecificCrud");
        itemCrud=(ItemCrud)ctx.getBean("ItemCrud");
        List<Item1> items=itemCrud.findAll();
        List<ItemSpecific>  itemSpecifics= itemSpecificCrud.findAll();
        int f =0;
        for(int  i =0;i  < itemSpecifics.size(); i++)
        {    
             if(items.get(i).getQuantity() == 0)
             {
                       itemSpecificCrud.removeById(itemSpecifics.get(i).getId());
                       itemCrud.removeById(items.get(i).getId());
             }
             else 
             {
                 
                 if(item1.size()  <  f)
                 {
                     f++;     
                      if(itemSpecifics.get(i).getName().equalsIgnoreCase(item1.get(f).getName()))
                      {
                        int quantity=items.get(i).getQuantity()-1;
                        Item1 itemss=items.get(i);
                        itemss.setQuantity(quantity);
                        itemCrud.merge(itemss);
                       
                      }
                 }
             }
        }
        
        return  invoice;
    }
    
}
