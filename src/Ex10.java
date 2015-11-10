import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agronis on 11/10/15.
 */
public class Ex10 {

    public static void main(String[] args) {

        int num = 12345;

        // int numReversed = 54321;

        String numbers = String.valueOf(num);
        String reverse = new StringBuilder(numbers).reverse().toString();

        System.out.println(reverse);


    }
    
}
