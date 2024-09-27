package com.easylife.backend.services;

import com.easylife.backend.domain.calorietracker.CalorieTracker;
import com.easylife.backend.domain.tacotable.TacoTable;
import com.easylife.backend.domain.tacotable.TacoTableRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalorieTrackerService {


    private TacoTableRepository tacoTableRepository;

    public CalorieTracker calcularCalorias(CalorieTracker calorieTracker) {

        Optional<TacoTable> tacoData = tacoTableRepository.findByAlimento(calorieTracker.getFoodname());

        if (tacoData.isPresent()) {
            TacoTable tacoTable = tacoData.get();
            calorieTracker.calcularTotalCalorie(tacoTable);
            return calorieTracker;
        } else {
            throw new RuntimeException("Alimento não encontrado na tabela Taco.");
        }
    }
}
