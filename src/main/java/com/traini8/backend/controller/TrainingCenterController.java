package com.traini8.backend.controller;

import com.traini8.backend.exception.ErrorResponse;
import com.traini8.backend.model.TrainingCenter;
import com.traini8.backend.service.TrainingCenterService;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class TrainingCenterController {
    @Autowired
    TrainingCenterService trainingCenterService;

    @PostMapping("/create/training-center")
    public ResponseEntity<TrainingCenter> trainingCenter(@Valid @RequestBody TrainingCenter trainingCenter){
        TrainingCenter trainingCenterResponse = trainingCenterService.createTrainingCenter(trainingCenter);
        return ResponseEntity.ok(trainingCenterResponse);
    }

    @GetMapping("/get/all/training-center")
    public ResponseEntity<List<TrainingCenter>> trainingCenterList(){
        List<TrainingCenter> trainingCenters = trainingCenterService.getAllTrainingCenter();
        return ResponseEntity.ok(trainingCenters);
    }
}
