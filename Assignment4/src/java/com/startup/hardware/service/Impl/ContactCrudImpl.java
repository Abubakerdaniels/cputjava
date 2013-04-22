/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Contact;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.ContactCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
 
@Service("ContactCrud")
@Transactional
public class ContactCrudImpl implements ContactCrud
{
      @Autowired
    private GenericDAO<Contact> dao;
   
    
  public final void setDao(final GenericDAO< Contact> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Contact.class);
    }

    
    @Override
    public Contact findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Contact> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Contact entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Contact entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Contact entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Contact v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Contact> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Contact getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Contact> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
