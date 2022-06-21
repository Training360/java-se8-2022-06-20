package streams;

import java.util.regex.Pattern;

public class RegexpDemo {

    public static void main(String[] args) {
        var pattern = Pattern.compile("href=\"([^\"]*)\"");
        var matcher = pattern.matcher("<a class=\"m-cf-indalista_container_list_item_link\" data-target=\"indafoto\" href=\"http://indafoto.hu/\" target=\"_blank\">Indafotó</a>");
//        if (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }

        matcher.results().map(r -> r.group(1)).forEach(System.out::println);

    }
}
