package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Elevators;
import net.restapi.springbootbackend.service.ElevatorsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/elevators")
public class ElevatorsController {

    private ElevatorsService elevatorsService;

    public ElevatorsController(ElevatorsService elevatorsService) {
        super();
        this.elevatorsService = elevatorsService;
    }



    //Get All Elevators
    @GetMapping()
    public List<Elevators> getAllElevators(){
        return elevatorsService.getAllElevators();
    }

    //Get Elevators By ID
    //http://localhost:8080/api/elevators/1
    @GetMapping("{id}")
    public ResponseEntity<Elevators> getUserById(@PathVariable ("id") long id){
        return new ResponseEntity<Elevators>(elevatorsService.getElevatorById(id), HttpStatus.OK);
    }



}