package Duck;

import FlyBehavior.*;
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("MallardDuck 出现");
    }
}