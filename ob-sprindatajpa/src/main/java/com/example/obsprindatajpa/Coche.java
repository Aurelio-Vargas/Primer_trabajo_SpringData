package com.example.obsprindatajpa;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coche {

    // atributos encapsulados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String model;
    private LocalDate releaseDate;

    // constructores

    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, LocalDate releaseDate) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.releaseDate = releaseDate;
    }

    // getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return releaseDate;
    }

    public void setYear(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    // tostring
    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}