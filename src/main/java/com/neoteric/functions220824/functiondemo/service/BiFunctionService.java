package com.neoteric.functions220824.functiondemo.service;

import com.neoteric.functions220824.functiondemo.model.Car;
import com.neoteric.functions220824.functiondemo.model.Employee;

import java.util.function.BiFunction;

public class BiFunctionService {

    BiFunction<Car, Employee, String> biFunction = (car, employee) -> {
        return "The " + employee.getFirstName() + " drives a " + car.getNameOfTheCar() + " " + car.getModelOfTheCar();
    };

    public static void main(String[] args) {
        BiFunctionService biFunctionService=new BiFunctionService();
        Car car=new Car("Audi","A6","2cr");
        Employee employee=new Employee("Manideep","Utla","9985533134",22);

        String carAndEmployeeFromBiFun=biFunctionService.biFunction.apply(car,employee);
        System.out.println("o/p from Bi-Function - " +carAndEmployeeFromBiFun);
    }
}
