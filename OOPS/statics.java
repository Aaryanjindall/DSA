public class statics {
    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolname = "qbc";
        System.out.println(s1.schoolname);
        student s2 = new student();
        s2.schoolname = "ery";
        System.out.println(s2.schoolname);
    }
}
class student {
    String name;
    int roll;
    static  String  schoolname;

}
