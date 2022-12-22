package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Batteries;
import net.restapi.springbootbackend.service.BatteriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/batteries")
public class BatteriesController {

    private BatteriesService batteriesService;

    public BatteriesController(BatteriesService batteriesService) {
        super();
        this.batteriesService = batteriesService;
    }



    //Get All Batteries
    @GetMapping()
    public List<Batteries> getAllBatteries(){
        return batteriesService.getAllBatteries();
    }

    //Get Batteries By ID
    //http://localhost:8080/api/batteries/1
    @GetMapping("{id}")
    public ResponseEntity<Batteries> getBatterieById(@PathVariable ("id") long id){
        return new ResponseEntity<Batteries>(batteriesService.getBatterieById(id), HttpStatus.OK);
    }



}