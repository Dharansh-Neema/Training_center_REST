package com.traini8.backend.service.Impl;

import com.traini8.backend.dao.TrainingCenterRepository;
import com.traini8.backend.model.TrainingCenter;
import com.traini8.backend.service.TrainingCenterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TrainingCenterImpl implements TrainingCenterService {
    @Autowired
    TrainingCenterRepository trainingCenterRepository;

    @Override
    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter){
        return trainingCenterRepository.save(trainingCenter);
    }

    @Override
    public List<TrainingCenter> getAllTrainingCenter()
    {
        return trainingCenterRepository.findAll();
    }
}
