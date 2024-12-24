package Plane;

import FlyBehavior.*;
public class Apache extends Plane {
    public Apache() {
        super(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Apache 出现");
    }
}