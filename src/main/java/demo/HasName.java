package demo;

public interface HasName {

    default String getName() {
       return "Anonymous";
    }
}
