import org.junit.Assert;
import org.junit.Test;

public class ItemParserTest {


    @Test
    public void separateTest() {
        ItemParser itemParser = new ItemParser();
        String rawData = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##";
        String expected = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016\nnaME:BreaD;price:1.23;type:Food;expiration:1/02/2016\nNAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016\n";
        String actual = itemParser.separate(rawData);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countMilkValuesTest() {
        ItemParser itemParser = new ItemParser();
        String rawData = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##";

        int expected = 1;
        int actual = itemParser.countMilkValues(rawData);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void countBreadValuesTest() {
        ItemParser itemParser = new ItemParser();
        String rawData = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##";

        int expected = 2;
        int actual = itemParser.countBreadValues(rawData);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void countCookiesValuesTest() {
        ItemParser itemParser = new ItemParser();
        String rawData = "naMe:Cookies;price:2.25;type:Food%expiration:1/25/2016##naMe:CoOkieS;price:2.25;type:Food*expiration:1/25/2016##naMe:COokIes;price:2.25;type:Food;expiration:3/22/2016##";
        int expected = 3;
        int actual = itemParser.countCookiesValues(rawData);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void countApplesValuesTest() {
        ItemParser itemParser = new ItemParser();
        String rawData = "naMe:apPles;price:0.25;type:Food;expiration:1/23/2016##naMe:apPles;price:0.23;type:Food;expiration:5/02/2016##";

        int expected = 2;
        int actual = itemParser.countApplesValues(rawData);

        Assert.assertEquals(expected, actual);

    }
}
