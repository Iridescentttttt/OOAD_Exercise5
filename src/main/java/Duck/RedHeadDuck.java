package Duck;

import FlyBehavior.*;
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck 出现");
    }
}