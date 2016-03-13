package com.mears.repositories;


import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.Repository;
import com.mears.entities.Driver;

public interface DriverRepository extends Repository<Driver, String>{

    @Query("{driverNum : ?0}")
    Driver findByDriverNum(String driverNum);

}