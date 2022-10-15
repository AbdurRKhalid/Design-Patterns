package ConcreteBuilder;

import Builder.Builder;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmiossion transmiossion;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seat) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

    }

    @Override
    public void setGPSNavigator(GPSNavigatior gpsNavigator) {

    }
}
