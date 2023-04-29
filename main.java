import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(3, "Oscar");
        tm.put(2, "Titouan");
        tm.put(7, "Joachim");

        for (Map.Entry<Integer, String> ent : tm.entrySet())
            System.out.println("Key : " + ent.getKey() + " | Value : " + ent.getValue());
    }
}