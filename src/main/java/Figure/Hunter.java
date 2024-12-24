package Figure;

import WearClothes.*;

public class Hunter extends Figure {
    public Hunter() {
        super(new WearShirts());
    }

    @Override
    public void display() {
        System.out.println("Hunter 出现");
        wearClothes.dressedIn(this.getClass().getSimpleName());
    }

    public void shoot() {
        System.out.println("Hunter 开枪");
    }
}