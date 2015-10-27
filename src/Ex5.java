import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Agronis on 10/27/15.
 */
public class Ex5 {

    //    Remove commas and periods.
    //    Make it all lowercase
    //    Split into words
    //    Remove duplicate words
    //    Create a new string without the duplicate words
    //    To be or not that is the question

    public static void main(String[] args) {

        String s = "To be or not to be, that is the question.";

        String[] words = s.toLowerCase().replace(",", "").replace(".", "").split(" ");

        ArrayList<String> newWords = new ArrayList();
        for (String word : words) {
            if (!newWords.contains(word)) {
                newWords.add(word);
            }
        }

        String newStr = "";
        for (String newWord : newWords) {
            if (!newStr.isEmpty()) {
                newStr += " ";
            }
            newStr += newWord;
        }
        System.out.println(newStr);
    }
}