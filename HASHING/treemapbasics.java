import java.util.TreeMap;
import java.util.Set;

public class treemapbasics{
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("india",100);
        tm.put("usa",200);
        tm.put("uk",300);

        System.out.println(tm);

        Set<String>keyss = tm.keySet();
        System.out.println(keyss);
        for(String key:keyss){
            System.out.println(key + " : " + tm.get(key));
        }
        
    }
}


