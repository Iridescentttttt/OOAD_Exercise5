package Plane;

public class ApacheFactory implements PlaneFactory{
    @Override
    public Plane createPlane() {
        return new Apache();
    }
}
