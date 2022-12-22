package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Buildings;

import java.util.List;

public interface BuildingsService {
    Buildings saveBuildings(Buildings buildings);

    List<Buildings> getAllBuildings();

    Buildings getBuildingById(long id);


}