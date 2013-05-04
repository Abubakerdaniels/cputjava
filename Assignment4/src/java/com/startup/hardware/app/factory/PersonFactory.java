/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.app.factory;

import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.StoreCustomer;
import com.startup.hardware.model.Supervisor;
import com.startup.hardware.model.User1;
import java.util.Map;

/**
 *
 * @author Wallied
 */
public  interface PersonFactory
{
    public  abstract    Person getPerson(Map<String,String>  values,LessonParameters  lesson);
    public  abstract    User1 getUser(String userName,String passWord );
    public  abstract    SalesPerson getSalesPerson(Map<String,String>  values,Person person);
    public  abstract    StoreCustomer  getStoreCustomers(double credit,String company_Name ,Person person);
    public  abstract    Supervisor  getSupervisor(String responsibilty,String department,Person person);
    
}
