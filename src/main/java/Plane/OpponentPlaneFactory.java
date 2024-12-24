package Plane;

public class OpponentPlaneFactory implements PlaneFactory{
    @Override
    public Plane createPlane() {
        return new OpponentPlane();
    }
}
