package com.org.tcs.repository;

import com.org.tcs.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BikeRepo extends JpaRepository <Bike, Integer>{

}
