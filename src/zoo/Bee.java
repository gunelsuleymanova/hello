package zoo;

public class Bee extends Animals implements fly{


    public Bee(String name, int age ,String gender) {
        super(name, age,gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" flowers polen");

    }

    @Override
    public void sound() {
        System.out.println(getName()+" sound is wizzzz");

    }


    @Override
    public void sleep() {

        System.out.println("bee is sleeping on honey plate jsjdbhjsd");
    }

    @Override
    public void fly() {
        System.out.println("bee can fly");
    }
}
