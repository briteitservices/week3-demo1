package com.briteitservices.week3;

import javax.annotation.PostConstruct;
import javax.annotation.security.PermitAll;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
@PermitAll
@Startup
public class EJBSample {

    private static final Logger log = Logger.getLogger(EJBSample.class.getName());

    @PostConstruct
    public void run() {
        log.log(Level.WARNING, "Hello EJB!");
    }
}
