import com.tasks.older.Palindrome;
import com.tasks.older.StringMerger;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //StringMerger.isMerge("codewars", "code", "wars"); //true
        StringMerger.isMerge("codewars", "cdwr", "oeas"); //true
        StringMerger.isMerge("codewars", "cod", "wars"); //false
    }


}
