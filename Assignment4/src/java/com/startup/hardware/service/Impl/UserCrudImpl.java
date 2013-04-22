/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.startup.hardware.service.Impl;

import com.startup.hardware.model.User;
import com.startup.hardware.repository.jpa.GenericDAO;
import com.startup.hardware.service.crud.UserCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wallied
 */
@Service("UserCrud")
@Transactional
public class UserCrudImpl implements UserCrud{
     @Autowired
    private GenericDAO<User> dao;
     
      public final void setDao(final GenericDAO< User> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(User.class);
    }
      
    public User findById(Long id)
    {
        setDao(dao);
        return dao.findById(id);
    }

    public List<User> findAll()
    {
        setDao(dao);
        return dao.findAll();
    }

    public void persist(User entity)
    {
         setDao(dao);
        dao.persist(entity);
    }

    public void merge(User entity)
    {
        setDao(dao);
        dao.merge(entity);
    }

    public void remove(User entity)
    {
        setDao(dao);
        dao.remove(entity);
    }

    public void removeById(Long entityId) 
    {
        setDao(dao);
        User v = dao.findById(entityId);
        dao.remove(v);
    }

    public List<User> findInRange(int firstResult, int maxResults)
    {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);
    }

    public long count() 
    {
        setDao(dao);
        return dao.count();
    }

    public User getByPropertyName(String name, String value) 
    {
         setDao(dao);
         return dao.getByPropertyName(name, value);
    }

    public List<User> getEntitiesByProperName(String name, String value)
    {
            setDao(dao);
            return dao.getEntitiesByProperName(name, value);
    }
}
