package FlyBehavior;

public class Fall implements FlyBehavior {
    @Override
    public void fly(String name) {
        System.out.println(name + " 坠落");
    }
}