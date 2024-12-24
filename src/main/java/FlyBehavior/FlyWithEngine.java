package FlyBehavior;

public class FlyWithEngine implements FlyBehavior{
    @Override
    public void fly(String name) {
        System.out.println(name + " 用引擎飞行");
    }
}
