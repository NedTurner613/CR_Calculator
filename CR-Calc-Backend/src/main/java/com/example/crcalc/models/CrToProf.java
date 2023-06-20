package com.example.crcalc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name = "cr_to_proficiency")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CrToProf {

    @Id
    private int CR;
    private int PB;

}
