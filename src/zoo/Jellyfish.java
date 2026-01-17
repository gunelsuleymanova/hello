package zoo;

public class Jellyfish extends Fish {
    public Jellyfish(String name, int age,String gender) {
        super(name, age,gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating planctons");

    }

    @Override
    public void sound() {
        System.out.println(getName()+" is make soun like no voice");

    }

    @Override
    public void sleep() {
        System.out.println("Jellyfish is sleeping in the water");

    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming");
    }
}
