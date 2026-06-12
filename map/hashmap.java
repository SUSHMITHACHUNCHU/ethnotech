import java.util.HashMap;

public class hashmap{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("Tree", "NeemTree");
        map.put("Flower", "Rose");
        map.put("Fruit", "Mango");
        map.put("Animal", "Dog");
        System.out.println("HashMap: " + map);
        System.out.println( map.get("Tree"));
        System.out.println(map.remove("Animal"));
        System.out.println( map);
        System.out.println(map.containsKey("Flower"));
        System.out.println(map.containsValue("apple"));
    }
}