public class maxsubarray {
    public static void subarray(int arr[]){
       
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            int start = i;
            
            for(int j = i ; j<arr.length ; j++){
                int e = j;
                currsum = 0;
                for(int k= start ; k<=e ; k++){
                    currsum += arr[k];
                    
                } 
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;

                }
                

                
                
            }
           
        }
        System.out.println("MAX SUM IS "+maxsum);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subarray(arr);
    }
}
