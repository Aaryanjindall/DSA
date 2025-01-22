public class maxkadane {
    public static int kadanes(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<nums.length ; i++){
            cs = cs + nums[i];
            if(cs<0){
                cs = 0;

            }
            ms = Math.max(cs,ms);

        }
        return ms;
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3, 4, -1, -2, 1 ,5 ,-3};
        System.out.println(kadanes(nums));
    }
}
