import java.util.HashMap;

/**
 * Created by Agronis on 10/26/15.
 */
public class Exercise4 {

    public static void main(String[] args) {

        String sentence = "To be or not to be, that is the question";
        HashMap<String, Integer> frequencies = new HashMap();

        String[] words = sentence.toLowerCase().replace(",", "").split(" ");
        for (String word : words) {
            String clean = word.toLowerCase().replace(",", "");
            if (frequencies.get(clean) == null) {
                frequencies.put(clean, 1);
            } else {
                int count = frequencies.get(clean);
                frequencies.put(clean, count + 1);
            }
        }


    }
}
