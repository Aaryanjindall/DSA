public class methodoverride{
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}