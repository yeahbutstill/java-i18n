package yeahbutstill.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {

        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatIndonesia() {

        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatJapan() {

        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);

        var format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatParseIndonesia() {

        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("Selasa 08 Juni 2021");
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }

    }

    @Test
    void testDateFormatParseJapan() {

        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);

        try {
            var date = dateFormat.parse("火曜日 08 6月 2021");
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }

    }
}
