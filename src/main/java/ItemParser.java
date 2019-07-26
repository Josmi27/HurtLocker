import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {
    public String separate(String rawData) {
        String response = rawData.replaceAll("##", "\n");
        return response;
    }

    public int countMilkValues(String rawData) {
        int milkCounter = 0;

        String regex = "M..k";
        String milkReplacer = rawData.replaceAll(regex, "milk");
        System.out.println(milkReplacer);
        String[] stringedArray = milkReplacer.split("##");
        Pattern pattern = Pattern.compile("milk");

        for (int i = 0; i < stringedArray.length; i++) {
            if ((stringedArray[i].substring(5, 9)).equals("milk")) {
                milkCounter += 1;
            }
        }
        return milkCounter;
    }

    public int countBreadValues(String rawData) {

        int breadCounter = 0;

        // This line uses regex to identify all variations of bread, and replace it with "milk"
        String breadReplacer = rawData.replaceAll(Pattern.compile("Registrar:b...d", Pattern.CASE_INSENSITIVE).toString(), "bread");

        // All values of price are the same.
        // All values of dates are the same.


        // ITERATE  THROUGH  EACH STRING IN ARRAY
        String[] stringedArray = rawData.split("##");
        for (int i=0; i < stringedArray.length;i++) {

        }
        return breadCounter;
    }

    public int countCookiesValues(String rawData) {
        int cookieCounter = 0;



        // This line uses regex to identify all variations of cookies, and replace it with "milk"
        String cookiesReplacer = rawData.replaceAll(Pattern.compile("Registrar:c.....s", Pattern.CASE_INSENSITIVE).toString(), "cookies");

        // ITERATE  THROUGH  EACH STRING IN ARRAY
        String[] stringedArray = rawData.split("##");
        for (int i=0; i < stringedArray.length;i++) {

        }
        return cookieCounter;
    }

    public int countApplesValues(String rawData) {
        int applesCounter = 0;

        // This line uses regex to identify all variations of apples, and replace it with "milk"
        String applesReplacer = rawData.replaceAll(Pattern.compile("Registrar:a....s", Pattern.CASE_INSENSITIVE).toString(), "apples");

        // ITERATE  THROUGH  EACH STRING IN ARRAY
        String[] stringedArray = rawData.split("##");
        for (int i=0; i < stringedArray.length;i++) {

        }
        return applesCounter;

    }

    public int tariqsCounter(String regex, String rawData) {
        return 0;
    }
}