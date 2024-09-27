package com.easylife.backend.domain.calorietracker;

import com.easylife.backend.domain.tacotable.TacoTable;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "calorietracker")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CalorieTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String foodname;
    private float quantidade;

    @Transient
    private float totalCalorie;

    // Este método deve aceitar um TacoTable, não TacoTableRepository
    public void calcularTotalCalorie(TacoTable tacoTable) {
        this.totalCalorie = tacoTable.getEnergiaKcal() * this.quantidade;
    }
}
