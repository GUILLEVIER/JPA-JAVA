package com.guillevier.jpa.service;

import com.guillevier.jpa.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

  @PersistenceContext
  private EntityManager entityManager;

  public long insert(User user) {
    entityManager.persist(user);
    return user.getId();
  }
}

/*
 * Spring Data JPA
 * 
 * 
 * 
 */
