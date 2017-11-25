package com.briteitservices.week3;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@ApplicationScoped
public class EntityManagerProvider {

    private static final Logger log = Logger.getLogger(EntityManagerProvider.class.getName());

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Produces
    @Default
    @RequestScoped
    public EntityManager create() {
        log.log(Level.INFO, "EM created");
        return this.entityManagerFactory.createEntityManager();
    }

    public void dispose(@Disposes @Default EntityManager entityManager) {
        log.log(Level.INFO, "EM disposed");
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
