package com.easylife.backend.controllers;

import com.easylife.backend.domain.calorietracker.CalorieTracker;
import com.easylife.backend.services.CalorieTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calorietracker")
public class CalorieTrackerController {

    @Autowired
    private CalorieTrackerService calorieTrackerService;

    @PostMapping
    public ResponseEntity<CalorieTracker> createCalorieTracker(@RequestBody CalorieTracker calorieTracker) {
        CalorieTracker result = calorieTrackerService.calcularCalorias(calorieTracker);
        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<List<CalorieTracker>> getAllCalorieTracker() {
        // Retornar todos os registros de calorietracker (sem lógica específica neste exemplo)
        return ResponseEntity.ok(List.of());  // Placeholder
    }
}
