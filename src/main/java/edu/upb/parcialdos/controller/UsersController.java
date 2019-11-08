/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.parcialdos.controller;

import edu.upb.parcialdos.controller.dao.UsersDAO;
import edu.upb.parcialdos.model.Users;
import edu.upb.parcialdos.util.PasswordUtil;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.inject.Inject;

/**
 *
 * @author Carlos
 */
@Named(value = "usersController")
@SessionScoped
public class UsersController implements Serializable {

    /**
     * Creates a new instance of UsersController
     */
    private Users actual;
    private DataModel<Users> listado = null;
    private int indiceElementoActual;

    @Inject
    UsersAuthController loginController;

    @EJB
    UsersDAO usersDAO;

    public UsersController() {
    }

    public Users getActual() {
        if (actual == null) {
            actual = new Users();
            indiceElementoActual = -1;
        }
        return actual;
    }

    public void setActual(Users actual) {
        this.actual = actual;
    }

    public DataModel<Users> getListado() {
        return null;
    }

    // Navigation methods
    public String viewList() {
        return "";
    }

    public String viewDetails() {
        return "";
    }

    public String viewCreate() {
        actual = new Users();

        return "create?faces-redirect=true";
    }

    public String viewEdit() {
        return "";
    }

    // Action methods
    public String doSave() {
       
        return "list?faces-redirect=true";

        
    }

    public String doUpdate() {
        return "";
    }

    public String doDelete() {
        return "";
    }

}
