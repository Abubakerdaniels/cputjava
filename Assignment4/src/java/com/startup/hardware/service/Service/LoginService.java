/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Service;

import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;

/**
 *
 * @author Wallied
 */
public interface LoginService 
{
       public  boolean loginSupervisor(Supervisor supervisor);    
       public  boolean loginSalesPerson(SalesPerson salesPerson);
       public  boolean loginCustomer(StoreCustomer  customer);
}
