// public class oops{
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         System.out.println(p1.color);
//         p1.setcolor("blue");
//         p1.settip(45);
//         System.out.println(p1.color);
//         System.out.println(p1.tip);
//         p1.color = "yellow";
//         System.out.println(p1.color);
//         System.out.println(p1.color);
//         Bank b1 = new Bank();
//         b1.setpass(75456);
//         b1.getpass();

//     }

// }
// class Pen{
//     String color;
//     int tip;
//     void setcolor(String newcolor){
//         color = newcolor;
//     }
//     void settip(int newTip){
//         tip = newTip;
//     }
// }
//     class Student{
//         String name;
//         int age;
//         float percentage;

//         void calpercent(int phy , int chem , int bio){
//             percentage = (phy + chem + bio)/3;
//         }
//     }
// class Bank{
//     private
//     String Name;
//     int Password;
//     void setpass(int newpass){
//         Password = newpass;
//     }
//     void getpass(){
//         System.out.println(Password);
//     }
// }




// public class oops{
//     public static void main(String[] args) {
//         Pen p1 = new Pen("pink");
//         Pen p2 = new Pen(123);
//         System.out.println(p1.color);
//         System.out.println(p1.tip);
//         System.out.println(p2.color);
//         System.out.println(p2.tip);
//         p1.setcolor("blue");
//         // p1.settip(45);
//         System.out.println(p1.color);
        


//     }

// }
// class Pen{
//     String color;
//     int tip;
//     void setcolor(String newcolor){
//         color = newcolor;
//     }
//     void settip(int newTip){
//         tip = newTip;
//     }
//     Pen(String color ){
//         this.color = color;
//     }
//     Pen(int tip){
//         this.tip = tip;
//     }
// }




// public class oops {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "aaryan";
//         s1.age = 18;
//         s1.marks[0] = 30;
//         s1.marks[1] = 60;
//         s1.marks[2] = 90;

//         Student s2 = new Student(s1);
//         for (int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// class Student {
//     String name;
//     int age;
//     int marks[];

//     // Default constructor
//     Student() {
//         marks = new int[3]; // Initialize the array
//     }

//     // Copy constructor
//     Student(Student s1) {
//         this.name = s1.name;
//         this.age = s1.age;
//         this.marks = new int[3]; // Initialize a new array
//         for (int i = 0; i < 3; i++) {
//             this.marks[i] = s1.marks[i]; // Copy values individually
//         }
//     }
// }




// public class oops {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "aaryan";
//         s1.age = 18;
//         s1.marks[0] = 30;
//         s1.marks[1] = 60;
//         s1.marks[2] = 90;

//         Student s2 = new Student(s1);

//         // Modify s1 marks to demonstrate shallow copy
//         s1.marks[0] = 100;

//         for (int i = 0; i < 3; i++) {
//             System.out.println("s2.marks[" + i + "] = " + s2.marks[i]);
//         }
//     }
// }

// class Student {
//     String name;
//     int age;
//     int marks[];

//     // Default constructor
//     Student() {
//         marks = new int[3]; // Initialize the array
//     }

//     // Copy constructor (shallow copy)
//     Student(Student s1) {
//         this.name = s1.name;
//         this.age = s1.age;
//         this.marks = s1.marks; // Shallow copy of the array
//     }
// }



