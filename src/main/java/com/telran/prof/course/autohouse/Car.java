package com.telran.prof.course.autohouse;

public class Car {

    private String fabric;
    private String model;
    private String color;
    private String fuelType;
    private int horsePower;
    private int yearOfManufacture;
    private double price;

    public Car(String fabric, String model, String color, String fuelType,
               int horsePower, int yearOfManufacture, double price) {
        this.fabric = fabric;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public String getFabric() {
        return fabric;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fabric='" + fabric + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engineType='" + fuelType + '\'' +
                ", horsePower=" + horsePower +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                '}';
    }
}
