package ru.romankuznetsov.builder2.builders;

import ru.romankuznetsov.builder2.components.CPU;
import ru.romankuznetsov.builder2.components.Monitor;
import ru.romankuznetsov.builder2.components.Mouse;
import ru.romankuznetsov.builder2.components.RAM;

public interface Builder {
    void setCPU(CPU cpu);
    void setMonitor(Monitor monitor);
    void setRAM(RAM ram);
    void setMouse(Mouse mouse);
}
