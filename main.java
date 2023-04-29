import oscar.Cat;

import java.util.LinkedList;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {

        LinkedList<Cat> group = new LinkedList<>();

        Cat c1 = new Cat("Oscar");
        Cat c2 = new Cat("Titouan");

        group.addFirst(c1);
        group.addFirst(c2);

        ListIterator<Cat> lit = group.listIterator();

        while (lit.hasNext())
            lit.next().miaou();

    }
}