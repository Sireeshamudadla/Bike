package com.org.tcs.service;

import com.org.tcs.model.Bike;
import com.org.tcs.repository.BikeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BikeServiceImplTest {
    @InjectMocks
    private BikeServiceImpl bikeServiceImpl;

    @Mock
    private BikeRepo bikeRepo;

    @Test
    void createBike() {
        Bike bike=new Bike();
        bike.setId(100);
        bike.setBikeName("siri");
        bike.setBikeAddress("blr");
        bikeServiceImpl.createBike(bike);
        Mockito.verify(bikeRepo,Mockito.times(1)).save(bike);
    }

    @Test
    void findByAll() {
        List<Bike> list=new ArrayList<>();
        Bike bike=new Bike();
        bike.setId(100);
        bike.setBikeName("siri");
        bike.setBikeAddress("blr");
        list.add(bike);
        Bike bike1=new Bike();
        bike1.setId(101);
        bike1.setBikeName("siri");
        bike1.setBikeAddress("blr");
        list.add(bike1);
        Mockito.when(bikeRepo.findAll()).thenReturn(list);
        List<Bike> list1  = bikeServiceImpl.findByAll();
        Assertions.assertEquals(list.size(),list1.size());
    }
    @Test
    void deleteById(){
        int id=100;
        String value="success";
        String value1=  bikeServiceImpl.deleteById(id);
        Mockito.verify(bikeRepo,Mockito.times(1)).deleteById(id);
        Assertions.assertEquals(value,value1);
    }
    @Test
    void getById(){
        int id=100;
        Bike bike=new Bike();
        bike.setId(100);
        bike.setBikeName("siri");
        bike.setBikeAddress("blr");
        Optional<Bike> bike1= Optional.of(new Bike());
        Mockito.when(bikeRepo.findById(id)).thenReturn(bike1);
        Optional<Bike> bike2=  bikeServiceImpl.getById(id);
        Assertions.assertEquals(bike1,bike2);

    }
    @Test
    void updateBike(){
        Bike bike=new Bike();
        bike.setId(100);
        bike.setBikeName("siri");
        bike.setBikeAddress("blr");
        bikeServiceImpl.updateBike(bike);
        Mockito.verify(bikeRepo,Mockito.times(1)).save(bike);

    }

}