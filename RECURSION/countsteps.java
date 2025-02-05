

public class countsteps{
    public static void counter(int c, int m) {
        
        if (c == m) {
            System.out.print("You have reached the mess");
        } else if (c>m) {
            System.out.print("you are going out");
        } else {
            System.out.println(c);
            counter(c+1,m);
            
            
        }
    }

    public static void main(String[] args) {
        int c = 101;
        int m = 100;
        counter(c, m);
    }
}
