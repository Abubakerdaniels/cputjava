/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Wallied
 */
public class Roles 
{
    
    
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id ;
    private String roleName;
    private String username ;
    @ManyToOne ( cascade = CascadeType.ALL )
    private Users user ;
}
