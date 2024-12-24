package Duck;

import FlyBehavior.*;
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("RubberDuck 出现");
    }
}