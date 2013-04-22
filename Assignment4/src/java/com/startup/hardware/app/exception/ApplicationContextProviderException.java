/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.app.exception;

import javax.persistence.PersistenceException;

/**
 *
 * @author Wallied
 */
public class ApplicationContextProviderException extends PersistenceException{
    private static final long serialVersionUID = 1L;
    
    
    public ApplicationContextProviderException(String message) {
        super(message);
    }

}
