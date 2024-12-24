package FlyBehavior;

public class FlyWithJetpack implements FlyBehavior{
    @Override
    public void fly(String name) {
        System.out.println(name + " 用喷气背包飞行");
    }

}
