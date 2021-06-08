package yeahbutstill.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatTypeIndonesia() {

        Locale indonesia = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);
        var pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, indonesia);
        var format = messageFormat.format(new Object[]{"Someone", new Date(), 100_000_000});
        System.out.println(format);

    }

    @Test
    void testMessageFormatTypeUSA() {

        var usa = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", usa);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, usa);
        var format = messageFormat.format(new Object[]{
                "Someone", new Date(), 100_000_000
        });

        System.out.println(format);

    }

}
