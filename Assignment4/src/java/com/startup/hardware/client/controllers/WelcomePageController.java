/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.client.controllers;

import com.startup.hardware.model.Welcome;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wallied
 */

@Controller
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
         return    "index";
    }
}
