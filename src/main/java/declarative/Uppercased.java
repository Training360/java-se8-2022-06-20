package declarative;

public class Uppercased {

    private String text;

    public Uppercased(String text) {
        this.text = text;
    }

    public String getValue() {
        return text.toUpperCase();
    }

    public static void main(String[] args) {
        String name = "John Doe";
        new Uppercased(name).getValue();
    }
}
