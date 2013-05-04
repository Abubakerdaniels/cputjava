/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.app.factory;

/**
 *
 * @author Wallied
 */
public class AbstractFactory 
{
    public  static PersonFactory   getPersonFactory(String type)
    {
          if(type.equalsIgnoreCase("supervisor"))
          {
              return   SupervisorFactory.getInstance();
          }
          else
          {
               return null;
          }
    }
}
