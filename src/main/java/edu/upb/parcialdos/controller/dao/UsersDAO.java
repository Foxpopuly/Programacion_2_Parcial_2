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

    private Class<Users> entityClass;
    
    @PersistenceContext(unitName = "parcial_dos_PU")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersDAO() {
    }
    
    public void create(Users entity) {
        getEntityManager().persist(entity);
    }

    public void edit(Users entity) {
        getEntityManager().merge(entity);
    }

    public void remove(Users entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public Users find(Object id) {
        
        return getEntityManager().find(entityClass, id);
    }

    public List<Users> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    
    
}
