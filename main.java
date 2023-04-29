import oscar.Color;

public class main {
    public static void main(String[] args) {
        Color c = Color.RED;

        System.out.println(c);

        for (Color col : Color.values())
            System.out.println(col);
    }
}