package com.org.tcs.service;

import com.org.tcs.model.Bike;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface BikeService {
    public void createBike(Bike bike);

    public List<Bike> findByAll();

    public String deleteById(Integer id);

    public Optional<Bike> getById(Integer id);
    public void updateBike( Bike  bike);
}