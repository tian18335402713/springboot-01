package com.example.demo.controller;

import com.example.demo.bean.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/findone")
    public Car findOneCar(){
        Car car = new Car(1, "toyo", 1999.99F,new Date(),"13567890001");


        return car;
    }



    @RequestMapping("/getall")
    public List<Car> getAll(){
        List<Car> list=new ArrayList<>();
        Car car1 = new Car(1, "toyo", 1999.99F,new Date(),"13567890001");
        Car car2= new Car(2, "dazhong", 2999.99F,new Date(),"13567890001");
        Car car3 = new Car(3, "fengtian", 3999.99F,new Date(),"13567890001");
        Car car4 = new Car(4, "benchi", 4999.99F,new Date(),"13567890001");
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        return list;

    }


}
