import java.util.ArrayList;
import java.util.List;

public class main {

    public static void printList(List<?> li) {
        for (Object o : li)
            System.out.println("> " + o); 
    } 


    public static void main(String[] args) {
        
        Fruit f = new Fruit("Cerise");
        Fruit f2 = new Fruit("Banane");
        Fruit f3 = new Fruit("Mange");

        List<Fruit> lf = new ArrayList<>();
        lf.add(f);
        lf.add(f2);
        lf.add(f3);

        Vegetable v = new Vegetable("Endive");
        Vegetable v2 = new Vegetable("Poireau");
        Vegetable v3 = new Vegetable("Patate");

        List<Vegetable> lv = new ArrayList<>();
        lv.add(v);
        lv.add(v2);
        lv.add(v3);

        printList(lv);
        printList(lf);
        // Basket<Fruit> bskF = new Basket(f);

        // System.out.println(bskF.getItem().getName());

        // Basket<Vegetable> bskV = new Basket(v);

        // System.out.println(bskV.getItem().getName());
    }
}