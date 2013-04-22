/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import javax.persistence.Embeddable;


/**
 *
 * @author Wallied
 */
@Embeddable
public class Contact implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String emailAddress;
 

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
   

    public Contact() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    
    public String getGender() {
        return gender;
    }

    public Contact(String emailAddress, String gender) {
        this.emailAddress = emailAddress;
      
        
        this.gender = gender;
    }
   
    private String gender;
    
}
