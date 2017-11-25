package com.briteitservices.week3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Level;
import java.util.logging.Logger;

@Singleton
@Startup
public class EJBSample {

    private static final Logger log = Logger.getLogger(EJBSample.class.getName());

    @PostConstruct
    public void run() {
        log.log(Level.WARNING, "Hello EJB!");
    }

    @PreDestroy
    public void doSomething() {

    }
}
