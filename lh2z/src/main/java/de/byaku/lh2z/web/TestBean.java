package de.byaku.lh2z.web;

import de.byaku.lh2z.service.EmissionService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class TestBean {

    @Inject
    private EmissionService emissionService;

    public String create() {
        emissionService.createTestRecord();
        return null; // bleibt auf der Seite
    }
}
