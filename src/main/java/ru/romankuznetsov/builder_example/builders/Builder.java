package ru.romankuznetsov.builder_example.builders;

import ru.romankuznetsov.builder_example.cars.CarType;
import ru.romankuznetsov.builder_example.components.Engine;
import ru.romankuznetsov.builder_example.components.GPSNavigator;
import ru.romankuznetsov.builder_example.components.Transmission;
import ru.romankuznetsov.builder_example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
