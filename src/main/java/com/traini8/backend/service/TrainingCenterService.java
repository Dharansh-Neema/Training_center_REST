package com.traini8.backend.service;

import com.traini8.backend.model.TrainingCenter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrainingCenterService {
    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter);

    public List<TrainingCenter> getAllTrainingCenter();
}
