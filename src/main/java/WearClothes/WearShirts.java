package WearClothes;

public class WearShirts implements WearClothes{
    @Override
    public void dressedIn(String name) {
        System.out.println(name + " 穿着短袖。");
    }
}
