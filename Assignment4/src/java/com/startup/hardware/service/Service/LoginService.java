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
       public  boolean loginSupervisor(String password,String username);    
       /**
     *
     * @param password
     * @param username
     * @return
     */
      public  boolean loginSalesPerson(String password,String username);
       public  boolean loginCustomer(String password,String username);
}
