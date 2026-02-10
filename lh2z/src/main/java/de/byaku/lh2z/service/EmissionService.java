package de.byaku.lh2z.service;

import de.byaku.lh2z.model.Co2Emission;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EmissionService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createTestRecord() {
        Co2Emission e = new Co2Emission("DE", "Germany", 2022, 123456.0);
        em.persist(e);
    }
}
