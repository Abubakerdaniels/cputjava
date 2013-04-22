/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.repository;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.Invoice1;
import com.startup.hardware.service.crud.InvoiceCrud;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
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
public class InvoiceRepository 
{
    private Long   id;
    private InvoiceCrud  invoiceCrud;
    private static  ApplicationContext  ctx;
    
    private GenericXmlApplicationContext ctx1;
    
    public InvoiceRepository() 
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
        ctx = new ClassPathXmlApplicationContext("classpath:com/startup/hardware/app/conf/applicationContext-*.xml");
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
    /**
     *
     */
    @Test
    public void testInvoiceCrud()
    {
        invoiceCrud=(InvoiceCrud)ctx.getBean("InvoiceCrud");
        Map<String,String>   invoice=new HashMap<String,String>();
        invoice.put("companyTo","Lavis Hardware");
        invoice.put("supplierUs","BuilderWarehouse");
        Invoice1  invoice1=AppFactory.getInvoice(invoice);
        invoiceCrud.persist(invoice1);
        id= invoice1.getId();
        Assert.assertNotNull(id,"Testing Persisted Entity");
        
        invoiceCrud.remove(invoice1);

        //Test tyo see if We have Deleted 
        Invoice1 invoice11 = invoiceCrud.findById(id);
        Assert.assertNull(invoice11,"Testing for Deleted InvoiceItem" ); 
    }
}
