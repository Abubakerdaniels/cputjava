/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Service;

import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.JoinClassItem;
import com.startup.hardware.model.JoinClassSalesPerson;
import com.startup.hardware.model.SalesPerson;
import java.util.List;

/**
 *
 * @author Wallied
 */

public interface HardwareService
{
    public ItemSpecific createItem(JoinClassItem  item1);
    public SalesPerson  salesPerson(JoinClassSalesPerson  salesPerson);
    public List<ItemSpecific>    getItems();
    
}
