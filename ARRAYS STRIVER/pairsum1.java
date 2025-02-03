import java.util.*;
public class pairsum1 {
    public static boolean pair(ArrayList<Integer>num , int target){
        int l = 0 ;
        int r = num.size() -1;
        while(l<r){
            if(num.get(l)+ num.get(r) == target){
                return true;
            }
            else if(num.get(l)+ num.get(r) <target){
                l++;
                
            }
            else{
                r--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        int target = 50;
        if(pair(num, target)){
            System.out.println("NUMBER FOUND");

        }
        else{
            System.out.println("NUMBER NOT FOUND");
        }

    }
}
