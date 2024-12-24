package FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(String name) {
        System.out.println(name + " 用翅膀飞行");
    }
}