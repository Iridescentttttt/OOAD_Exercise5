package Figure;

import Plane.PlaneSubject;
import WearClothes.WearClothes;
import Weather.WeatherSubject;

public abstract class FigureDecorator extends Figure {
    private Figure figure;
    public FigureDecorator(Figure f, WeatherSubject w, PlaneSubject p) {
        super(w,p);
        this.figure = f;
    }

    @Override
    public void dressedIn(){
        if(figure != null){
            figure.dressedIn();
        }
    }
}
