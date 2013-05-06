/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Service;

import com.startup.hardware.model.Invoice1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import java.util.List;

/**
 *
 * @author Wallied
 */
public interface BuyService 
{
    /**
     *
     * @param item1
     * @param salesPerson
     * @return
     */
  
    
    
    public  Invoice1 buy(List<ItemSpecific>  item1,SalesPerson salesPerson,StoreCustomer customer);
    
}
