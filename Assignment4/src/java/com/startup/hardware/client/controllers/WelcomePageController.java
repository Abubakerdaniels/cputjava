/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.client.controllers;



import com.startup.hardware.model.ItemSpecific;
import com.startup.hardware.model.JoinClassItem;
import com.startup.hardware.model.JoinClassSalesPerson;
import com.startup.hardware.model.SalesPerson;
import com.startup.hardware.model.Welcome;
import com.startup.hardware.service.Service.HardwareService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Wallied
 */

@Controller
@SessionAttributes
public class WelcomePageController
{
    @Autowired
    private   HardwareService  hardwareService;
    
   
    
    @RequestMapping({"/Welcome"})
    public String   welcomePage(Model  model)
    {
         Welcome message = new Welcome();
         message.setToday(new Date());
         message.setWelcome("Welcome to the Home Page   of  Builder  WareHouse");
         model.addAttribute("msg", message);
       // String message="Welcome to Hardware Store";
         return    "WelcomePage";
    }
    @RequestMapping(value="/ShowAllItem", method = RequestMethod.GET)
    public  String  showAllItem(Model  model)
    {
       List<ItemSpecific>  itemSpec1=hardwareService.getItems();
         
         
       model.addAttribute("msg3",itemSpec1);
       return  "ShowAllItem";
    }
    @RequestMapping(value = "/ShowCustomer", method = RequestMethod.GET)
    public  String  showCustomer(Model  model)
    {
        
        return  "ShowCustomer";
    }
   
     
    /**
     *
     * @param item1
     * @param result
     * @return
     */
    @RequestMapping(value="/showItem",method=RequestMethod.POST)
    public  String   createItem(Model  model,@ModelAttribute("CreateItem") JoinClassItem item1,BindingResult  result)
    {
         System.out.println("\nQuantity: "+item1.getQuantity()+"\nDescription: "+item1.getDescription()+"\nItem ID: "+item1.getItem_ID()+"\nSize:"+item1.getSizes()+"\nModel: "+item1.getModel()+"\nPrice:"+item1.getPrice());
        
         JoinClassItem  joinC=new  JoinClassItem();
         ItemSpecific itemSpecific=hardwareService.createItem(item1);
         joinC.setQuantity(itemSpecific.getItem_ID());
         joinC.setDescription(itemSpecific.getDescription());
         joinC.setSizes(item1.getSizes());
         joinC.setItem_ID(itemSpecific.getItem_ID());
         joinC.setModel(itemSpecific.getModel());
         joinC.setPrice(item1.getPrice());
         model.addAttribute("msg1",joinC);
         
         return  "showItem";
    }
    @RequestMapping(value="/showSalesPerson",method=RequestMethod.POST)
    public  String createSalesPerson(Model  model,@ModelAttribute("CreateSalesPerson") JoinClassSalesPerson salesPerson,BindingResult  result)
    {
        JoinClassSalesPerson joinS=new JoinClassSalesPerson();
        SalesPerson  salesPerson1=hardwareService.salesPerson(salesPerson);
        joinS.setDaily_SalesHandled(salesPerson1.getDaily_SalesHandled());
        joinS.setFulltime(salesPerson1.isFullTIme());   
        joinS.setHisMonthTurnOver(salesPerson1.getHisMonthTurnOver());
        joinS.setTemp(salesPerson1.isTemp());
        joinS.setDateOfBirth(salesPerson1.getPerson().getDateOfBirth());
        joinS.setEmailAddress(salesPerson1.getPerson().getContact().getEmailAddress());
        joinS.setFirstName(salesPerson1.getPerson().getFirstName());
        joinS.setGender(salesPerson1.getPerson().getGender());
        joinS.setLastName(salesPerson1.getPerson().getLastName());
        joinS.setPhysicalAddress(salesPerson1.getPerson().getAddress().toString());
       // joinS.setProceedPerMonth(salesPerson1.getSales().);
       // joinS.setProceedPerYear(salesPerson1.getProceedPerYear());
        joinS.setId(salesPerson1.getId());
        model.addAttribute("msg2",joinS);
        return  "showSalesPerson";
    }
    
    @RequestMapping({"/CreateItem"})
    public   ModelAndView  createItem()
    {
       
        return  new  ModelAndView("CreateItem","command",new JoinClassItem());
    }
    
    @RequestMapping({"/CreateSalesPerson"})
    public   ModelAndView  createSalesPerson()
    {
        return  new    ModelAndView("CreateSalesPerson","command",new  JoinClassSalesPerson());
    }
    
    
   @RequestMapping({"/showCustomer"})
   public  String  showCust(Model  model)
   {
       
         return  "showCustomer";
   }
   @RequestMapping({"/login"})
   public  String login()
   {
       
       return  "login";
   }
   
   @RequestMapping({"/accessDenied"})
   public  String accessDenied()
   {
       
       return  "accessDenied";
   }
    
}
