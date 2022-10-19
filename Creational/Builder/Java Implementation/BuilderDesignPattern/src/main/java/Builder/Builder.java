package Builder;

import Components.*;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seat);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
