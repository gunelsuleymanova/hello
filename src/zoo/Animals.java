package zoo;

public  abstract class Animals {

private String name;
private int age;
private String gender;
private static int animalCount=0;

public Animals(String name,int age,String gender){
    setName(name);
    setAge(age);
    setGender(gender);
    animalCount++;

}
// burada set eledim deyerleri
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}
public void setGender(String gender){
    this.gender=gender;
}


 // burada get eledim deyerleri
 public String getName(){
    return name;
 }
 public int getAge(){
    return age;
 }
public String getGender(){
    return gender;
}

 // burada abstract methodlar var
public abstract void eat();
public abstract void sound();
//public abstract void hunting();


//adi method
public  void sleep(){
    System.out.println("Bu heyvan yatir..");
}
public static int getAnimalCount(){
    return animalCount;
}
}
