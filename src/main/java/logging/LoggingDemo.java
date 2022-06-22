package logging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingDemo {

    public static String getMessage() {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        return "hu";
    }

    public static void main(String[] args) {
        log.debug(getMessage());
    }
}
