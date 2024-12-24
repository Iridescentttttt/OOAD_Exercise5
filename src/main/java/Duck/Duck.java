package Duck;

import FlyBehavior.*;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " 在水面游动");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(this.getClass().getSimpleName());
    }

    public void die() {
        System.out.println(this.getClass().getSimpleName() + " 死亡");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}