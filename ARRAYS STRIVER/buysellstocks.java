public class buysellstocks {
    public static int buyandsell(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i<=prices.length-1; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                // maxProfit = profit;
                //or
                maxProfit = Math.max(maxProfit,profit);

            }
            else{
                buyprice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsell(prices));
    }
}
