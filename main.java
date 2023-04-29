import oscar.Cat;

import java.util.ListIterator;
import java.util.Stack;

public class main {
    public static void main(String[] args) {

        Stack<Cat> group = new Stack<>();

        Cat c1 = new Cat("Oscar");
        Cat c2 = new Cat("Titouan");

        group.push(c1);
        group.push(c2);

        ListIterator<Cat> lit = group.listIterator();

        while (lit.hasNext())
            lit.next().miaou();

        group.peek().miaou();
    }
}