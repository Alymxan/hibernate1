package com.alym.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="model")
    private String model;

    @Column(name="speed")
    private Integer speed;

    public Car(String model, Integer speed) {
        this.model = model;
        this.speed = speed;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
