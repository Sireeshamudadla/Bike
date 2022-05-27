package com.org.tcs.controller;


import com.org.tcs.model.Bike;
import com.org.tcs.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BikeController {

    @Autowired
    BikeService bikeService;

    @PostMapping("/create")
    public void createBike(@RequestBody Bike bike){
        bikeService.createBike(bike);

    }

    @GetMapping("/getAll")
    public List<Bike>findByAll(){
     List<Bike> ss  =bikeService.findByAll();
        return ss;

     }
     @GetMapping("/getById/{id}")
     public Optional<Bike> getById(@PathVariable Integer id){
         Optional<Bike> bike= bikeService.getById(id);
        return bike;
     }
     @PutMapping("/update")
     public void updateBike(@RequestBody Bike  bike){
         bikeService.updateBike(bike);

     }
     @DeleteMapping("/deleteByID/{id}")
    public String deleteById(@PathVariable Integer id){
         bikeService.deleteById(id);
         return "success";
     }


}
