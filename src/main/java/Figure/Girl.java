package Figure;

import WearClothes.*;

public class Girl extends Figure {
    public Girl() {
        super(new WearPullover());
    }

    @Override
    public void display() {
        System.out.println("Girl 出现,");
        wearClothes.dressedIn(this.getClass().getSimpleName());
    }
}