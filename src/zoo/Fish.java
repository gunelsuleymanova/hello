package zoo;

public class Fish extends Animals implements swim{
    public Fish(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish or plancton vs");

    }

    @Override
    public void sound() {
        System.out.println(getName()+" sound is like blu blu");

    }

    @Override
    public void swim() {
        System.out.println(getName()+" swimming");

    }
}
