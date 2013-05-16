/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.client.controllers;



import com.startup.hardware.model.JoinClassItem;
import com.startup.hardware.model.Welcome;
import java.util.Date;
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
    @RequestMapping({"/createCustomer"})
    public  String  createContact(Model  model)
    {
        
        return  "CreateCustomer";
    }
    @RequestMapping({"/CreateSalesPerson"})
    public   String  createSalesPerson(Model  model)
    {
        return   "CreateSalesPerson";
    }
     
    /**
     *
     * @param item1
     * @param result
     * @return
     */
    @RequestMapping(value="/showCustomer",method=RequestMethod.POST)
    public  String   createItem(Model  model,@ModelAttribute("CreateItem") JoinClassItem item1,BindingResult  result)
    {
         System.out.println("Quantity: "+item1.getQuantity()+"Description: "+item1.getDescription()+"Item ID: "+item1.getItem_ID()+"Size:"+item1.getSizes()+"Model: "+item1.getModel()+"Price:"+item1.getPrice());
         JoinClassItem  joinC=new  JoinClassItem();
         joinC.setQuantity(item1.getItem_ID());
         joinC.setDescription(item1.getDescription());
         joinC.setItem_ID(item1.getItem_ID());
         joinC.setModel(item1.getModel());
         joinC.setPrice(item1.getPrice());
         model.addAttribute("msg1",joinC);
         return  "showCustomer";
    }
  
    @RequestMapping({"/CreateItem"})
    public   ModelAndView  createItem()
    {
       
        return  new  ModelAndView("CreateItem","command",new JoinClassItem());
    }
   /*@RequestMapping({"/showCustomer"})
   public  String  showCust()
   {
       
         return  "showCustomer";
   }*/
   
    
}
