package ru.romankuznetsov.builder2;

import ru.romankuznetsov.builder2.builders.ComputerBuilder;
import ru.romankuznetsov.builder2.comp.Computer;
import ru.romankuznetsov.builder2.components.CPU;
import ru.romankuznetsov.builder2.components.RAM;

public class App {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        RAM ram = new RAM();
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.setCPU(cpu);
        computerBuilder.setRAM(ram);
        Computer computer = computerBuilder.build();
        System.out.println(computer);
    }
}
