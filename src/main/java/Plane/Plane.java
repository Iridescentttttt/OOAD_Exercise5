package Plane;

import FlyBehavior.*;
public abstract class Plane {
    protected FlyBehavior flyBehavior;

    public Plane(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(this.getClass().getSimpleName());
    }
}