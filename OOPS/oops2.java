public class oops2 {
    public static void main(String[] args) {
        Fish shark = new Fish(5);
        shark.eat();
        System.out.println(shark.fins);

    }

}
class Animal{
    String Color;
    void eat(){
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("breathe");
    }


}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
    Fish(int finss){
        fins = finss;
    }
}