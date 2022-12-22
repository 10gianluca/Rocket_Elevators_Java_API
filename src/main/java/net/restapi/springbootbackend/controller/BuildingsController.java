package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Buildings;
import net.restapi.springbootbackend.service.BuildingsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buildings")
public class BuildingsController {

    private BuildingsService buildingsService;

    public BuildingsController(BuildingsService buildingsService) {
        super();
        this.buildingsService = buildingsService;
    }



    //Get All Buildings
    @GetMapping()
    public List<Buildings> getAllBuildings(){
        return buildingsService.getAllBuildings();
    }

    //Get Buildings By ID
    //http://localhost:8080/api/buildings/1
    @GetMapping("{id}")
    public ResponseEntity<Buildings> getBuildingById(@PathVariable ("id") long id){
        return new ResponseEntity<Buildings>(buildingsService.getBuildingById(id), HttpStatus.OK);
    }



}