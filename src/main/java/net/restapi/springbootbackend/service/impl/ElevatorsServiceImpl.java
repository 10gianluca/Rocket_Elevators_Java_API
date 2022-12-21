package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Elevators;
import net.restapi.springbootbackend.repository.ElevatorsRepository;
import net.restapi.springbootbackend.service.ElevatorsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElevatorsServiceImpl implements ElevatorsService {
    private ElevatorsRepository elevatorsRepository;

    public ElevatorsServiceImpl(ElevatorsRepository elevatorsRepository) {
        super();
        this.elevatorsRepository = elevatorsRepository;
    }

    @Override
    public Elevators saveElevators(Elevators elevators) {
        return elevatorsRepository.save(elevators);
    }

    @Override
    public List<Elevators> getAllElevators() {
        return elevatorsRepository.findAll();
    }

    @Override
    public Elevators getElevatorById(long id) {
        Optional<Elevators> elevators = elevatorsRepository.findAllById(id);
        if (elevators.isPresent()) {
            return elevators.get();
        } else {
            throw new ResourceNotFoundException("elevators", "id", id);
        }
    }


}