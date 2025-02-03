import java.util.ArrayList;

public class containingwater {
    public static int container(ArrayList<Integer>list){
        int maxwater = 0;
        for(int i = 0 ; i<list.size(); i++){
            for(int j = i+1 ; j<list.size() ; j++){
                int ht = Math.min(list.get(i),list.get(j));
                int width = j-i;
                int currwater = ht*width;
                maxwater = Math.max(currwater , maxwater);



            }
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
