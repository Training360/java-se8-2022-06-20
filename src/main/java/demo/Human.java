package demo;

public interface Human {

    default String getName() {
        return "Noname";
    }
}
