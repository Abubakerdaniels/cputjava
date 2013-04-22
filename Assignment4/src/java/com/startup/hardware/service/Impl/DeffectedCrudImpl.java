/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.DeffectedItems;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.DeffectedItemsCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("DeffectedItemsCrud")
@Transactional
public class DeffectedCrudImpl implements DeffectedItemsCrud
{
    
    @Autowired
    private GenericDAO<DeffectedItems> dao;
   
    
  public final void setDao(final GenericDAO< DeffectedItems> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(DeffectedItems.class);
    }

    
    @Override
    public DeffectedItems findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<DeffectedItems> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(DeffectedItems entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(DeffectedItems entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(DeffectedItems entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        DeffectedItems v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<DeffectedItems> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public DeffectedItems getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<DeffectedItems> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }


    
}
