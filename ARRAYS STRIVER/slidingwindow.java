public class slidingwindow {
    public static int maxsubarray(int windows[], int k){
        int c = 0;
        int n = windows.length-1;
        for(int i = 0 ; i<k ; i++){
            c += windows[i];
        }
        int mx = c;
        for(int i = k; i<n ; i++){
            c += windows[i];
            c -= windows[i-k];
            if(mx < c){
                mx = c;
            }

        }
        return mx;


    }
    
    public static void main(String[] args) {
        int window[] = {1,2,4,5,3,1};
        int k = 3;
      
        System.out.println(maxsubarray(window,k));

    }
}
