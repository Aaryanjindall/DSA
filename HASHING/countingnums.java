import java.util.*;
public class countingnums {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> st = new HashSet<>();

        for(int i = 0 ; i<arr.length ; i++){
            st.add(arr[i]);

        }

        System.out.println(st.size());
        
    }
}
