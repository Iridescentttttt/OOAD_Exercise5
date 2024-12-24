package Plane;

import FlyBehavior.*;
public class Boeing extends Plane {
    public Boeing() {
        super(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Boeing 出现");
    }
}