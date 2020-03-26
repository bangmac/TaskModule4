package com.bangmacblog.repository.impl;

import com.bangmacblog.model.Blog;
import com.bangmacblog.repository.BlogRepository;

import javax.persistence.*;
import java.util.List;

public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = em.createQuery("select c from Blog c", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        TypedQuery<Blog> query = em.createQuery("select c from Blog c where c.id=:id", Blog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void save(Blog model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Blog blog = findById(id);
        if(blog != null){
            em.remove(blog);
        }
    }


}
