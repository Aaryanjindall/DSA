public class tilingproblem {
    public static int tiling(int x){
        //base case
        if(x == 0 || x == 1){
            return 1;

        }
        else{
            return tiling(x-1)+ tiling(x-2);

        }
    }
   public static void main(String[] args) {
    int n = 4;
    //n is the customisable width of ground of fixed length 2 
    System.out.println(tiling(n)); 
   } 
}
