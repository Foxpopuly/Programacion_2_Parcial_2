/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.parcialdos.controller.dao;

import edu.upb.parcialdos.model.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Carlos
 */
@Stateless
public class UsersDAO  {

    @PersistenceContext(unitName = "parcial_dos_PU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersDAO() {
    }
    
    public void create(Users entity) {
        
    }

    public void edit(Users entity) {
        
    }

    public void remove(Users entity) {
        
    }

    public Users find(Object id) {
        
        return null;
    }

    public List<Users> findAll() {
        return null;
    }

    
    
}
