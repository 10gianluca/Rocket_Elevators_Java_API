package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Interventions;
import net.restapi.springbootbackend.repository.InterventionsRepository;
import net.restapi.springbootbackend.service.InterventionsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterventionsServiceImpl implements InterventionsService {
    private InterventionsRepository interventionsRepository;

    public InterventionsServiceImpl(InterventionsRepository interventionsRepository) {
        super();
        this.interventionsRepository = interventionsRepository;
    }

    @Override
    public Interventions saveInterventions(Interventions interventions) {
        return interventionsRepository.save(interventions);
    }

    @Override
    public List<Interventions> getAllInterventions() {
        return interventionsRepository.findAll();
    }

    @Override
    public Interventions getInterventionById(long id) {
        Optional<Interventions> interventions = interventionsRepository.findAllById(id);
        if(interventions.isPresent()){
            return interventions.get();
        }else{
            throw new ResourceNotFoundException("Intervention", "id", id);
        }
    }

    @Override
    public Interventions updatedIntervention(Interventions interventions, long id) {
        // check if intervention with id exists
        Interventions existingInterventions = interventionsRepository.findAllById(id).orElseThrow(
                () -> new ResourceNotFoundException("Intervention", "Id", id));

//        existingInterventions.setId(interventions.getId());
//        existingInterventions.setAuthor(interventions.getAuthor());
//        existingInterventions.setCustomerID(interventions.getCustomerID());
        existingInterventions.setBuildingID(interventions.getBuildingID());
        existingInterventions.setBatteryID(interventions.getBatteryID());
        existingInterventions.setColumnID(interventions.getColumnID());
        existingInterventions.setElevatorID(interventions.getElevatorID());
//        existingInterventions.setEmployeeID(interventions.getEmployeeID());
//        existingInterventions.setStartDate(interventions.getStartDate());
//        existingInterventions.setEndDate(interventions.getEndDate());
//        existingInterventions.setResult(interventions.getResult());
        existingInterventions.setReport(interventions.getReport());
//        existingInterventions.setStatus(interventions.getStatus());
//        existingInterventions.setCreated_at(interventions.getCreated_at());
//        existingInterventions.setUpdated_at(interventions.getUpdated_at());
        //save existing intervention
        interventionsRepository.save(existingInterventions);
        return existingInterventions;
    }

    @Override
    public void deleteIntervention(long id) {
        //check if id is real
        interventionsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Intervention", "Id", id));
        interventionsRepository.deleteById(id);
    }
}
