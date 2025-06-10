public class largeststring {
    
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","mango","kiwi","orange"};
        String largest = fruits[0];
        for(int i = 1 ; i < fruits.length ; i++){
            if(fruits[i].length() > largest.length()){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

}
