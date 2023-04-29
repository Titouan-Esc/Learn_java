package oscar;

public enum Color {
    RED("Rouge", ""),
    GREEN("Vert", ""),
    BLUE("Bleu", "");

    private String mName;
    private String mHexValue;


    Color(String name, String hexValue) {
        this.mName = name;
        this.mHexValue = hexValue;
    }

    public String toString() {
        return this.mName;
    }
}
