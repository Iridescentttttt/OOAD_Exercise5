package Figure;

import Plane.PlaneSubject;
import WearClothes.*;
import Weather.WeatherSubject;

public class Hunter extends Figure {
    public Hunter(WeatherSubject w, PlaneSubject p) {
        super(w, p);
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