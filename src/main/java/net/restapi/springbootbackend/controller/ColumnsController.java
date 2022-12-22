package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Columns;

import net.restapi.springbootbackend.model.Elevators;
import net.restapi.springbootbackend.service.ColumnsService;
import net.restapi.springbootbackend.service.ElevatorsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/columns")
public class ColumnsController {

    private ColumnsService columnsService;

    public ColumnsController(ColumnsService columnsService) {
        super();
        this.columnsService = columnsService;
    }


    //Get All Columns
    @GetMapping()
    public List<Columns> getAllColumns() {
        return columnsService.getAllColumns();
    }

    //Get Columns By ID
    //http://localhost:8080/api/columns/1
    @GetMapping("{id}")
    public ResponseEntity<Columns> getColumnById(@PathVariable("id") long id) {
        return new ResponseEntity<Columns>(columnsService.getColumnById(id), HttpStatus.OK);
    }


}