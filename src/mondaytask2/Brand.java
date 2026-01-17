package mondaytask2;

import java.util.ArrayList;
import java.util.List;

public class Brand {
    private String model;
    List<Model> Modellist;

    public Brand(String model,List<Model> models) {
        this.model = model;
       // Modellist = modellist;
        this.Modellist = models;
    }


    public void addmodel(Model model){
        Modellist.add(model);
    }


    public List<Model> getModellist() {
        return Modellist;
    }


    @Override
    public String toString() {
        return "Brand{" +
                "model='" + model + '\'' +
                ", Modellist=" + Modellist +
                '}';
    }
}


//    public Brand(String modee, Model model1, Model model2, Model model3, Model model4) {
//    }

