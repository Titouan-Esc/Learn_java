import oscar.Fighter;
import oscar.Jason;

public class main {
    public static void main(String[] args) {

        // Polymorphisme
        Fighter[] elements = {new Jason()};

        for (Fighter e : elements)
            e.fight();
    }
}