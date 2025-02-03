import java.util.*;
public class containwater2pointer {
    public static int container(ArrayList<Integer>height){
        int l = 0;
        int maxwater = 0;
        int r = height.size() - 1;
        while(l<r){
            int ht = Math.min(height.get(l),height.get(r));
            int width = r - l;
            int currwater = ht*width;
            maxwater = Math.max(maxwater,currwater);

            //update ptr
            // if(height.get(l)<height.get(r)){
            //     l++;
            // }
            // else{
            //     r--;
            // }
            l++;
            r--;
        }
        return maxwater;
        
    }
    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
            
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
    
        System.out.println(container(height));
    
        }
    }

