package WalkBehavior;

public class WalkOnTheGround implements WalkBehavior{
    @Override
    public void walk(String name) {
        System.out.println(name + " 在路上走着。");
    }
}
