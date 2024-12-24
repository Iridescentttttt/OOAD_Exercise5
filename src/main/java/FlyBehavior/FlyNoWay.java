package FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(String name) {
        System.out.println(name + " 不能飞行");
    }
}