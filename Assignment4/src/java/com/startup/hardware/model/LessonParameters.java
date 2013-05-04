/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

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
    @OneToMany
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }
    private User1    user1;

    public LessonParameters() {
    }

    public Contact getContact() {
        return contact;
    }


    public User1 getUser() {
        return user1;
    }
    
    public LessonParameters(Contact contact,List<Address> address,User1 user1)
    {
        this.address=address;
        this.contact=contact;
        this.user1 =user1;
        
    }
}
