package Figure;

import Plane.PlaneSubject;
import WearClothes.*;
import Weather.WeatherSubject;

public class Girl extends Figure {

    public Girl(WeatherSubject w, PlaneSubject p) {
        super(w, p);
    }

    @Override
    public void display() {
        System.out.println("Girl 出现,");
        wearClothes.dressedIn(this.getClass().getSimpleName());
    }

}