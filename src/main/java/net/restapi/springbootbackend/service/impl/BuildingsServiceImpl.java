package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Buildings;
import net.restapi.springbootbackend.repository.BuildingsRepository;
import net.restapi.springbootbackend.service.BuildingsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingsServiceImpl implements BuildingsService {
    private BuildingsRepository buildingsRepository;

    public BuildingsServiceImpl(BuildingsRepository buildingsRepository) {
        super();
        this.buildingsRepository = buildingsRepository;
    }

    @Override
    public Buildings saveBuildings(Buildings buildings) {
        return buildingsRepository.save(buildings);
    }

    @Override
    public List<Buildings> getAllBuildings() {
        return buildingsRepository.findAll();
    }

    @Override
    public Buildings getBuildingById(long id) {
        Optional<Buildings> buildings = buildingsRepository.findAllById(id);
        if (buildings.isPresent()) {
            return buildings.get();
        } else {
            throw new ResourceNotFoundException("buildings", "id", id);
        }
    }



}