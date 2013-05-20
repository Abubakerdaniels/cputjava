/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Wallied
 */
public class Users  implements Serializable 
{
    private static final long serialVersionUID = 1L ;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (unique= true )
    private String username;
    private String passwd; 
    private boolean enabled ;
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name= "roleid" )
    private List<Roles> roles;
}
