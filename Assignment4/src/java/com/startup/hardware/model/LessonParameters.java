/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author Wallied
 */
@Embeddable
public class LessonParameters implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Embedded
    private Contact contact;
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }
    private User    user;

    public LessonParameters() {
    }

    public Contact getContact() {
        return contact;
    }


    public User getUser() {
        return user;
    }
    
    public LessonParameters(Contact contact,List<Address> address,User user)
    {
        this.address=address;
        this.contact=contact;
        this.user =user;
        
    }
}
