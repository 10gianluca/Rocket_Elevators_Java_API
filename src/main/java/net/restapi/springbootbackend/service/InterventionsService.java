package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Interventions;

import java.util.List;

public interface InterventionsService {
    Interventions saveInterventions(Interventions interventions);
    List<Interventions> getAllInterventions();
    Interventions getInterventionById(long id);
    Interventions updatedIntervention(Interventions interventions, long id);
    void deleteIntervention(long id);
}
