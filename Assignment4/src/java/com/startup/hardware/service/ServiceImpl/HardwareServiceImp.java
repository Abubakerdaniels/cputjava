/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.ServiceImpl;

import com.startup.hardware.app.factory.AppFactory;
import com.startup.hardware.model.Address;
import com.startup.hardware.model.Contact;
import com.startup.hardware.model.Item1;
import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.JoinClassItem;
import com.startup.hardware.model.JoinClassSalesPerson;
import com.startup.hardware.model.LessonParameters;
import com.startup.hardware.model.Person;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.User1;
import com.startup.hardware.service.Service.HardwareService;

import com.startup.hardware.service.crud.ItemCrud;
import com.startup.hardware.service.crud.ItemSpecificCrud;
import com.startup.hardware.service.crud.PersonCrud;
import com.startup.hardware.service.crud.SalesPersonCrud;
import com.startup.hardware.service.crud.UserCrud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Wallied
 */
@Service("HardwareService")
public class HardwareServiceImp  implements  HardwareService
{
    @Autowired
    private ItemCrud  itemCrud;
    @Autowired
    private ItemSpecificCrud  itemSpec1;
    @Autowired 
    private SalesPersonCrud  salePersonCrud;
    @Autowired
    private UserCrud   userCrud;
    @Autowired
    private PersonCrud personCrud; 

    private Long id;
    
   
    
   
   
    public ItemSpecific createItem(JoinClassItem item1) 
    {
            
            List<ItemSpecific> itemSpec=new ArrayList<ItemSpecific>();
            HashMap<String,String>  itemSpecificationValues=new HashMap<String,String>();
            itemSpecificationValues.put("model",item1.getModel());
            itemSpecificationValues.put("Item_ID",item1.getItem_ID()+"");
            itemSpecificationValues.put("sizes",item1.getSizes()+"");
            itemSpecificationValues.put("Price",item1.getPrice()+"");
            itemSpecificationValues.put("Description",item1.getDescription());
            itemSpecificationValues.put("name","solid works");
            ItemSpecific itemspec=AppFactory.getItemSpecific(itemSpecificationValues);
            itemSpec1.persist(itemspec);
            Item1  item;
            item = AppFactory.getItem(itemSpec);
        
            itemCrud.persist(item);
            id =itemspec.getId();
            return   itemSpec1.findById(id);
    }

    public SalesPerson salesPerson(JoinClassSalesPerson salesPerson)
    {
        
         Map<String,String> personValues=new HashMap<String,String>();
         personValues.put("firstName",salesPerson.getFirstName());
         personValues.put("lastName",salesPerson.getLastName());
         personValues.put("dateOfBirth",salesPerson.getDateOfBirth()+"");
         personValues.put("middelName", "Grobler");
         personValues.put("gender",salesPerson.getGender());
        
         Contact contact=AppFactory.getContact(salesPerson.getEmailAddress(),"0736487777","0219981888",salesPerson.getGender());
         Address address;
         address = AppFactory.getAddress(salesPerson.getPostalAddress(),salesPerson.getPhysicalAddress(),salesPerson.getPostalCode());
         User1    user1;
         user1 = AppFactory.getUser(salesPerson.getUserName(),salesPerson.getPassword());
        
         userCrud.persist(user1);
        
         List<Address> listAddress=new ArrayList<Address>();
         listAddress.add(address);
         LessonParameters lesson;
         lesson = new LessonParameters(contact,listAddress,user1);
         Person person;
         person = AppFactory.getPerson(personValues, lesson);
         
         Map<String,String>  salePvalues=new HashMap<String,String>();
         salePvalues.put("daily_SalesHandled",salesPerson.getDaily_SalesHandled()+"");
         salePvalues.put("hisMonthTurnOver",salesPerson.getHisMonthTurnOver()+"");
         salePvalues.put("temp",salesPerson.isTemp()+"");
         salePvalues.put("fullTime",salesPerson.isFulltime()+"");
         SalesPerson salesPerson1=AppFactory.getSalesPerson(salePvalues, person);
         personCrud.persist(person);
         salePersonCrud.persist(salesPerson1);
         id= salesPerson1.getId();
         
         return  salePersonCrud.findById(id);
    }

    public List<ItemSpecific> getItems() 
    {
         return   itemSpec1.findAll();
    }
    
}
