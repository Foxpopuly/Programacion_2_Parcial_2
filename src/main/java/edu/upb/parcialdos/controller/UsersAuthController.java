/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.parcialdos.controller;

import edu.upb.parcialdos.model.Users;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Carlos
 */
@Named(value = "usersAuthController")
@SessionScoped
public class UsersAuthController implements Serializable {

    /**
     * Creates a new instance of UsersAuthController
     */
    public UsersAuthController() {
    }
    
        
    
}
