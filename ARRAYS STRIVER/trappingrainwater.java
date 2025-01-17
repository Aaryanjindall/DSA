import java.util.*;
public class trappingrainwater {
    public static int trapped(int height[]){
        if (height == null || height.length < 3) {
            return 0;
        }
        //calculate left max boundary-array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1 ; i<height.length ; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary-array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2 ; i>=0 ; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        //calculating trapped water using both array
        //now compare both auxilary arrays
        int trappedwater = 0;
        int waterlevel = 0;
        for(int i = 0 ; i<height.length ;  i++){
            waterlevel = Math.min(leftmax[i],rightmax[i]);
            //now trapped water = waterlevel - actual height
            trappedwater += waterlevel - height[i]; 

        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("TRAPPED WATER IS:"+trapped(height));

    }
}
