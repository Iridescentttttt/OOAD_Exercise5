package WalkBehavior;

public class RunToHouse implements WalkBehavior{
    @Override
    public void walk(String name) {
        System.out.println(name + " 跑到了房子里。");
    }
}
