package taskuc;

public enum Colours {
    RED("qirmizi reng"),
    BLUE("mavi reng"),
    BLACK("qara reng ");

    private final String description;

     Colours(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }


}
