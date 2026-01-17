public class Ata {
    String name ;
    Integer age;
    public Ata(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public void info(){
        System.out.println("bu atanin methodudur ");
        System.out.println(name+" "+age);
        System.out.println(this.name+" "+this.age);
    }





}
