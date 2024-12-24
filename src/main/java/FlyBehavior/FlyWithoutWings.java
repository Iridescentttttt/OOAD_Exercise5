package FlyBehavior;

public class FlyWithoutWings implements FlyBehavior {
    @Override
    public void fly(String name) {
        System.out.println(name + " 不用翅膀飞行");
    }
}