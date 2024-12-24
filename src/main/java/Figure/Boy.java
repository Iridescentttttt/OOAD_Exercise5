package Figure;

import Plane.PlaneSubject;
import WearClothes.*;
import Weather.WeatherSubject;

public class Boy extends Figure {

    public Boy(WeatherSubject w, PlaneSubject p) {
        super(w, p);
    }

    @Override
    public void display() {
        System.out.println("Boy 出现,");
        wearClothes.dressedIn(this.getClass().getSimpleName());
    }

}