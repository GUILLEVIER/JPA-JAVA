package com.guillevier.jpa;

import com.guillevier.jpa.entity.User;
import com.guillevier.jpa.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

  private static final Logger log
          = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

  @Autowired
  private UserDAOService userDaoService;

  @Override
  public void run(String... arg0) throws Exception {
    User user = new User("Jack", "Admin");
    //New User is created : User [id=1, name=Jack, role=Admin]
    long insert = userDaoService.insert(user);
    log.info("New User is created : " + user);
  }
}
