package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

    public static void main(String[] args) {
        try (var lines = Files.lines(Path.of("src/main/resources/index.hu.html"))) {
            var count = lines.filter(FilesDemo::containsPutyin).count();
            System.out.println(count);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static boolean containsPutyin(String s) {
        return s.contains("Putyin");
    }
}
