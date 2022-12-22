package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Batteries;

import java.util.List;

public interface BatteriesService {
    Batteries saveBatteries(Batteries batteries);

    List<Batteries> getAllBatteries();

    Batteries getBatterieById(long id);


}