package ru.romankuznetsov.builder2.comp;

import ru.romankuznetsov.builder2.components.CPU;
import ru.romankuznetsov.builder2.components.Monitor;
import ru.romankuznetsov.builder2.components.Mouse;
import ru.romankuznetsov.builder2.components.RAM;

public class Computer {
    private Monitor monitor;
    private CPU cpu;
    private RAM ram;
    private Mouse mouse;

    public Computer(Monitor monitor, CPU cpu, RAM ram, Mouse mouse) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.ram = ram;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor=" + monitor +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", mouse=" + mouse +
                '}';
    }
}
