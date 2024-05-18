package systemDesign.designPattern.builder.builders;

import systemDesign.designPattern.builder.cars.CarType;
import systemDesign.designPattern.builder.components.Engine;
import systemDesign.designPattern.builder.components.GPSNavigator;
import systemDesign.designPattern.builder.components.Transmission;
import systemDesign.designPattern.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}