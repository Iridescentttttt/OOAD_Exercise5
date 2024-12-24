package Figure;

import WearClothes.*;
public abstract class Figure {
    protected  WearClothes wearClothes;

    public Figure(WearClothes wearClothes){this.wearClothes = wearClothes;}

    public abstract void display();

    public void walk() {
        System.out.println(this.getClass().getSimpleName() + " 在地面走路");
    }
}