/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Address;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.AddressCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("AddressCrud")
@Transactional
public class AddressCrudImpl  implements AddressCrud{
    
    @Autowired
    private GenericDAO<Address> dao;
   
    
  public final void setDao(final GenericDAO< Address> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Address.class);
    }

    
    @Override
    public Address findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Address> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Address entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Address entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Address entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Address v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Address> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Address getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Address> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }


}