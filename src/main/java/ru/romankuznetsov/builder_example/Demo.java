package ru.romankuznetsov.builder_example;

import ru.romankuznetsov.builder_example.builders.CarBuilder;
import ru.romankuznetsov.builder_example.builders.CarManualBuilder;
import ru.romankuznetsov.builder_example.cars.Car;
import ru.romankuznetsov.builder_example.cars.Manual;
import ru.romankuznetsov.builder_example.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
