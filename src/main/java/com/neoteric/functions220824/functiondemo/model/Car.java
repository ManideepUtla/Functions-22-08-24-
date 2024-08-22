package com.neoteric.functions220824.functiondemo.model;

public class Car {

    // car
    public String nameOfTheCar;
    public String modelOfTheCar;
    public String price;

    public String getNameOfTheCar() {
        return nameOfTheCar;
    }

    public String getModelOfTheCar() {
        return modelOfTheCar;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "nameOfTheCar='" + nameOfTheCar + '\'' +
                ", modelOfTheCar='" + modelOfTheCar + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Car(String nameOfTheCar, String modelOfTheCar, String price){
        this.nameOfTheCar=nameOfTheCar;
        this.modelOfTheCar=modelOfTheCar;
        this.price=price;
    }
}
