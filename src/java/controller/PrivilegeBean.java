package controller;

import dao.PrivilegeDAO;
import entity.Privileges;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped

public class PrivilegeBean implements Serializable {

    private Privileges entity;
    private PrivilegeDAO dao;
    private List<Privileges> list;

    public void clearForm() {
        this.entity = new Privileges();
    }

    public void create() {
        this.getDao().create(entity);
        this.entity = new Privileges();
    }

    public void update() {
        this.getDao().update(entity);
        this.entity = new Privileges();
    }

    public void delete() {
        this.getDao().delete(entity);
        this.entity = new Privileges();
    }

    public Privileges getEntity() {
        if (this.entity == null) {
            this.entity = new Privileges();
        }
        return entity;
    }

    public void setEntity(Privileges entity) {
        this.entity = entity;
    }

    public PrivilegeDAO getDao() {
        if (this.dao == null) {
            this.dao = new PrivilegeDAO();
        }
        return dao;
    }

    public void setDao(PrivilegeDAO dao) {
        this.dao = dao;
    }

    public List<Privileges> getList() {
        this.list = this.getDao().readList();
        return list;
    }

    public void setList(List<Privileges> list) {
        this.list = list;
    }

}
