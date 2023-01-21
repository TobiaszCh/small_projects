import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        List<String> list= new ArrayList<>();
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) != ' ') {
                list.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
            }
        }
        String[] result=new String[list.size()];
        result=list.toArray(result);
        return result;
    }
}
