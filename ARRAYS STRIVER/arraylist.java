import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        //operations

        //adding 
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        System.out.println(list);


        list.add(1,9);
        System.out.println(list); //O(n)


        // get element
        int element = list.get(2);
        System.out.println(element);

        //remove element
        list.remove(2);
        System.out.println(list);


        //set element
        list.set(1,10);
        System.out.println(list);


        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));


       


        
        






        

    }
}
