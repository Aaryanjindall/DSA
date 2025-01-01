public class abstractclass {
   public static void main(String[] args) {
    horse h = new horse();
    h.eat();
    h.walk();
    System.out.println(h.color);
    h.changecolor();
    System.out.println(h.color);

    chicken c = new chicken();
    c.eat();
    c.walk();
    System.out.println(c.color);
    c.changecolor();
    System.out.println(c.color);
    System.out.println(h.color);
   }  
}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("constructor called for animal");

    }
    void eat(){
        System.out.println("animal eats");


    }
    abstract void walk();
}
class horse extends Animal{
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 4 legs");

    }
}
class chicken extends horse{
    void changecolor(){
        color = "black";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}