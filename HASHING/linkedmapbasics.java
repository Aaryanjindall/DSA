import java.util.LinkedHashMap;
import java.util.Set;
public class linkedmapbasics {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("usa",200);
        lhm.put("uk",300);

        System.out.println(lhm);

        Set<String>keyss = lhm.keySet();
        System.out.println(keyss);
        for(String key:keyss){
            System.out.println(key + " : " + lhm.get(key));
        }



    }
}
