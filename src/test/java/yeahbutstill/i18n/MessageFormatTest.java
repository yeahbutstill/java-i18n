package yeahbutstill.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {

        var pattern = "Hi {0}, anda bisa mencari data anda dengan mengetik `{0}` di pencarian.";
        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{"Dani"});
        System.out.println(format);

    }

    @Test
    void testMessageFormatResourceBundle() {

        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Dani",
                "Yeahbutstill Fuck This My World!"
        });

        System.out.println(format);

    }

    @Test
    void testMessageFormatResourceBundleUSA() {

        var locale = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Dani",
                "Yeahbutstill Fuck This My World!"
        });

        System.out.println(format);

    }

}
