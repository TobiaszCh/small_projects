import java.util.ArrayList;
import java.util.List;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int a;
        int result = 0;
        String textLower = text.toLowerCase();
        String[] duplicates = textLower.split("");
        List<String> deleteDuplicate = new ArrayList<>();
        for(String duplicate: duplicates) {
            a = textLower.length() - textLower.replace(duplicate, "").length();
            if (a > 1 && !deleteDuplicate.contains(duplicate)) {
                deleteDuplicate.add(duplicate);
                result++;
            }
        }
        return result;
    }
}
