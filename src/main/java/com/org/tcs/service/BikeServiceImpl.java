package com.org.tcs.service;

import com.org.tcs.model.Bike;
import com.org.tcs.repository.BikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BikeServiceImpl implements BikeService{
    @Autowired
    BikeRepo bikeRepo;
    @Override
    public void createBike(Bike bike) {
        bikeRepo.save(bike);

    }
    @Override
    public List<Bike> findByAll() {
        List<Bike> s =bikeRepo.findAll();
        return s;
    }

    @Override
    public String deleteById(Integer id) {
        bikeRepo.deleteById(id);
        return "success";
    }

    @Override
    public Optional<Bike> getById(Integer id) {
        Optional<Bike> bike=  bikeRepo.findById(id);
        return bike;
    }

    @Override
    public void updateBike(Bike bike) {
        bikeRepo.save(bike);

    }

}
