/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Invoice1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.service.Service.BuyService;
import com.startup.hardware.service.crud.InvoiceCrud;
import com.startup.hardware.service.crud.ItemCrud;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Wallied
 */
public class BuyServiceImpl implements BuyService 
{
    private    InvoiceCrud  invoiceCrud;
    private    ItemCrud   itemCrud;
    private    ApplicationContext ctx;
    
    public  BuyServiceImpl()
    {
      ctx=new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
    }
    public Invoice1 buy(List<ItemSpecific> item1, SalesPerson salesPerson,StoreCustomer customer)
    {
        invoiceCrud=(InvoiceCrud) ctx.getBean("InvoiceCrud");
        ItemSpecific itemSpecific;
        return null;
    }
    
}
