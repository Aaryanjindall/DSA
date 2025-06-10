import java.util.*;
public class heaps {
    static class heap{
        
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){ //o(logn)
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x , arr.get(par));
                arr.set(par,temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }
        
    }
}
