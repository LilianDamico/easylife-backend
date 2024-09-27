package com.easylife.backend.domain.tacotable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name="taco_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "numero")
public class TacoTable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "Alimento")
    private String alimento; // Alterado para 'alimento' com inicial minúscula

    @Column(name = "energia_kcal")
    private Float energiaKcal;

    @Column(name = "energia_kj")
    private Float energiaKj;

}
