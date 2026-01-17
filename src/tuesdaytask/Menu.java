package tuesdaytask;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<Dishes>dishes;


    public Menu(List<Dishes> dishes ){
        this.dishes=dishes;
    }

    public List<Dishes> getDishes() {
        return dishes;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }

}
