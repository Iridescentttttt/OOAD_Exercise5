package Figure;

import WearClothes.*;

public class Boy extends Figure {
    public Boy() {
        super(new WearPullover());
    }

    @Override
    public void display() {
        System.out.println("Boy 出现,");
        wearClothes.dressedIn(this.getClass().getSimpleName());
    }
}