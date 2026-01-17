package taskuc;

public class Phone {
    private String name ;
    private int storage;

    public Phone(String name,int storage){
        this.name=name;
        this.storage=storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", storage=" + storage +
                '}';
    }
}
