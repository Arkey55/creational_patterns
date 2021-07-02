package ru.romankuznetsov.builder2.builders;

import ru.romankuznetsov.builder2.components.CPU;
import ru.romankuznetsov.builder2.comp.Computer;
import ru.romankuznetsov.builder2.components.Monitor;
import ru.romankuznetsov.builder2.components.Mouse;
import ru.romankuznetsov.builder2.components.RAM;

public class ComputerBuilder implements Builder {
    private Monitor monitor;
    private CPU cpu;
    private RAM ram;
    private Mouse mouse;

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Computer build(){
        return new Computer(monitor, cpu, ram, mouse);
    }
}
