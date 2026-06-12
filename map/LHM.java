import java.util.*;
public class LHM{
    public static void main(String[] args){
        HashMap<String,Integer> h=new HashMap<>();
        h.put("even", 1);
        h.put("even", 2);
        h.put("even", 3);
        h.put("even", 4);
        h.put("even", 5);
        System.out.println(h);
        LinkedHashMap<String,Integer>lh=new LinkedHashMap<>(h);
        lh.put("odd", 1);
        lh.put("even", 2);
        lh.put("odd", 3);
        lh.put("even", 4);
        lh.put("odd", 5);
        System.out.println(lh);
    }
}