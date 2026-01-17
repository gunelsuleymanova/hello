package mondaytask2;

import taskuc.Colours;

public enum Color {

    RED("qirmizi"),
    BLUE("mavi "),
    BLACK("qara");

    private String description;
    Color(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }
}
