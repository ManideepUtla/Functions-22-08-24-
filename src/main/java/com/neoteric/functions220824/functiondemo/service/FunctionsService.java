package com.neoteric.functions220824.functiondemo.service;

import com.neoteric.functions220824.functiondemo.model.Car;
import com.neoteric.functions220824.functiondemo.model.Employee;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsService {

    Function<Car, Car> carFunction=(car)->{
        return car;
    };




    public static void main(String[] args) {
        FunctionsService functionsService=new FunctionsService();

        Car car =new Car("Audi","a6","2cr");

        Car carFromCar =functionsService.carFunction.apply(car);
        System.out.println("o/p from car Function - "+ carFromCar);
    }

}
