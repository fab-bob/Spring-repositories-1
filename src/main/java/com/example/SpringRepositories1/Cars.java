package com.example.SpringRepositories1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cars {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String modelName;

    private int serialNumber;

    private double currentPrice;



}
