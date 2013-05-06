/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.Supervisor;
import com.startup.hardware.repository.jpa.GenericDAO;

import com.startup.hardware.service.crud.SupervisorCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("SupervisorCrud")
@Transactional
public class SupervisorCrudImpl implements SupervisorCrud {
     @Autowired
    private GenericDAO<Supervisor> dao;
     
      public final void setDao(final GenericDAO< Supervisor> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Supervisor.class);
    }
      
    public Supervisor findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<Supervisor> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(Supervisor entity)
    {
         setDao(dao);
         dao.persist(entity);
    }

    public void merge(Supervisor entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(Supervisor entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        Supervisor v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<Supervisor> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public Supervisor getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<Supervisor> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
     
}
