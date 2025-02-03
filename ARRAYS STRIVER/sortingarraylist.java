import java.util.*;

public class sortingarraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
