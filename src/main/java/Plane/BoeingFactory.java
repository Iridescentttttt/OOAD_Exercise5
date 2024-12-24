package Plane;

public class BoeingFactory implements PlaneFactory{
    @Override
    public Plane createPlane() {
        return new Boeing();
    }
}
