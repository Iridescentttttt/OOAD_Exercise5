package WearClothes;

public class WearRaincoat implements WearClothes{
    @Override
    public void dressedIn(String name) {
        System.out.println(name + " 穿着雨衣。");
    }
}
