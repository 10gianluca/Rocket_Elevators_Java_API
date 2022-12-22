package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Elevators;

import java.util.List;

public interface ElevatorsService {
    Elevators saveElevators(Elevators elevators);

    List<Elevators> getAllElevators();

    Elevators getElevatorById(long id);


}