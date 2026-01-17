package zoo;

import java.util.SimpleTimeZone;

public class Rabit extends Animals implements jump{
    public Rabit(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eate vegetables");

    }

    @Override
    public void sound() {
        System.out.println(getName()+" sound low");

    }

    @Override
    public void jump() {
        System.out.println(getName()+" jumping ");

    }}
//
//    @Override
//    public void hunting() {
//
//
//    }

