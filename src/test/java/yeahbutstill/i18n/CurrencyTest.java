package yeahbutstill.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrencyIndonesia() {

        var indonesia = new Locale("in", "ID");
        var curreny = Currency.getInstance(indonesia);

        System.out.println(curreny.getDisplayName());
        System.out.println(curreny.getCurrencyCode());
        System.out.println(curreny.getSymbol(indonesia));

    }

    @Test
    void testCurrencyUSA() {

        var usa = new Locale("en", "US");
        var currency = Currency.getInstance(usa);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(usa));

    }

    @Test
    void testNumberFormatCurrencyIndonesia() {

        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(10_000_000);

        System.out.println(format);

    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {

        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var parse = numberFormat.parse("Rp9.000.000,25").doubleValue();
            System.out.println(parse);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

    }
}
