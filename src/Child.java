public class Child extends Ata {

    public Child(String name, Integer age) {
        super(name, age);
    }

    public void info(){
        System.out.println("bu child calsdir ");
        System.out.println(this.name+" "+this.age);
        System.out.println(name+" "+age);
    }


}
