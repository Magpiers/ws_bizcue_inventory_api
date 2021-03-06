package com.magpiers.demo_dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.magpiers.demo_dashboard.entity.Screen;

@Repository
public interface ScreenRepository extends MongoRepository<Screen, String>{

}
