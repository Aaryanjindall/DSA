import java.util.Stack;
public class Stackq5{
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        
        for(int i = 0 ; i<arr.length ; i++){
            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsl[i] = -1;

            }
            else{
                nsl[i] = s.peek();

            }
            s.push(i);


        }
        s.clear();

        for(int i = arr.length-1 ; i>=0 ; i--){
            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsr[i] = n;

            }
            else{
                nsr[i] = s.peek();

            }
            s.push(i);

        }

        //current area = (right - left - 1) * arr[i]
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            if(area > max){
                max = area;
            }

        }
        System.out.println(max);


    }

}