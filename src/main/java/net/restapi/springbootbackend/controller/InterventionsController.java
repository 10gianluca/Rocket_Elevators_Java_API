package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Interventions;
import net.restapi.springbootbackend.service.InterventionsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interventions")
public class InterventionsController {

    private InterventionsService interventionsService;

    public InterventionsController(InterventionsService interventionsService) {
        super();
        this.interventionsService = interventionsService;
    }

    //Create Intervention
    @PostMapping(value="new")
    public ResponseEntity<Interventions> saveInterventions(@RequestBody Interventions interventions){
        return new ResponseEntity<Interventions>(interventionsService.saveInterventions(interventions), HttpStatus.CREATED);
    }


    //Get All Interventions
    @GetMapping()
    public List<Interventions> getAllInterventions(){
        return interventionsService.getAllInterventions();
    }

    //Get Intervention By ID
    //http://localhost:8080/api/interventions/1
    @GetMapping("{id}")
    public ResponseEntity<Interventions> getInterventionById(@PathVariable ("id") long id){
        return new ResponseEntity<Interventions>(interventionsService.getInterventionById(id), HttpStatus.OK);
    }

    //Updated Intervention
    //http://localhost:8080/api/interventions/update/1
    @PatchMapping(value="update/{id}")
    public ResponseEntity<Interventions> updateInterventions(@PathVariable ("id") long id, @RequestBody Interventions interventions){
        return new ResponseEntity<Interventions>(interventionsService.updatedIntervention(interventions, id), HttpStatus.OK);
    }

    //Delete Intervention
    //http://localhost:8080/api/interventions/delete/1

    @DeleteMapping(value="delete/{id}")
    public ResponseEntity<String> deleteIntervention(@PathVariable("id") long id){
        interventionsService.deleteIntervention(id);
        return new ResponseEntity<String>("Intervention Deleted", HttpStatus.OK);
    }
}
