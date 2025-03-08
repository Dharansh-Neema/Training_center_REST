package com.traini8.backend.dao;

import com.traini8.backend.model.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CenterRepository extends MongoRepository<TrainingCenter,String> {
}
