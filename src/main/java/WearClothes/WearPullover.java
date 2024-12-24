package WearClothes;

public class WearPullover implements WearClothes{

    @Override
    public void dressedIn(String name) {
        System.out.println(name + " 穿着毛衣。");
    }
}
