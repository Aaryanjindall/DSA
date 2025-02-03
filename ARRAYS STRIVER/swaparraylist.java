import java.util.ArrayList;

public class swaparraylist {


    public static void swapp(ArrayList<Integer>list , int a , int b){
        int temp = list.get(a);
        list.set(a , list.get(b));
        list.set(b , temp);
        System.out.println(list);
    }
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(4);
        System.out.println(list);
        int a = 2;
        int b = 4;
        swapp(list , a , b);


    }
}
