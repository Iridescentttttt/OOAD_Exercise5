package Duck;

import FlyBehavior.*;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    private boolean alive = true;

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
        alive = false;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void revive() {
        System.out.println(this.getClass().getSimpleName() + " 在附近的水域神秘地复活了");
        alive = true;
    }
}