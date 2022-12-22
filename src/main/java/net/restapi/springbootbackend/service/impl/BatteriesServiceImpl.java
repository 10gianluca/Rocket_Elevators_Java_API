package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Batteries;
import net.restapi.springbootbackend.repository.BatteriesRepository;
import net.restapi.springbootbackend.service.BatteriesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatteriesServiceImpl implements BatteriesService {
    private BatteriesRepository batteriesRepository;

    public BatteriesServiceImpl(BatteriesRepository batteriesRepository) {
        super();
        this.batteriesRepository = batteriesRepository;
    }

    @Override
    public Batteries saveBatteries(Batteries batteries) {
        return batteriesRepository.save(batteries);
    }

    @Override
    public List<Batteries> getAllBatteries() {
        return batteriesRepository.findAll();
    }

    @Override
    public Batteries getBatterieById(long id) {
        Optional<Batteries> batteries = batteriesRepository.findAllById(id);
        if (batteries.isPresent()) {
            return batteries.get();
        } else {
            throw new ResourceNotFoundException("batteries", "id", id);
        }
    }



}