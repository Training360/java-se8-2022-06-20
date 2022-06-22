package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DatesMain {

    private static final DateFormat format = new SimpleDateFormat("yyyy MM dd");

    public static void main(String[] args) {
        LocalDateTime.of(2022, 02, 02, 10, 00, 00);
        var time = LocalDateTime.parse("2017-04-05T10:27:36");
        System.out.println(time);
        LocalDateTime.of(2022, 9, 10, 10, 10, 10);
        System.out.println(017);


        var date = new Date();
        System.out.println(date);
        format.format(date);


        var formatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.CHINA);
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.println(LocalDateTime.now().format(formatter));

        Clock clock = Clock.fixed(LocalDateTime.parse("2022-01-01T10:00:00")
                .atZone(ZoneId.systemDefault()).toInstant(), ZoneId.systemDefault());

        var t = LocalDateTime.now(clock);

        System.out.println(t);

    }
}
