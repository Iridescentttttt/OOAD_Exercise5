package Plane;

public class AirBusFactory implements PlaneFactory{
    @Override
    public Plane createPlane() {
        return new AirBus();
    }
}
