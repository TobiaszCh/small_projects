public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        int c = k;
        int a = 0;
        int d = 0;
        boolean breaks = true;
        if(k > 0 && k <= strarr.length) {
            while (breaks) {
                while (c > 0) {
                    c--;
                    stringBuilder.append(strarr[a]);
                    a++;
                    System.out.println(stringBuilder);
                }
                if (stringBuilder.length() > builder.length()) {
                    builder = stringBuilder;
                }
                stringBuilder = new StringBuilder("");
                if (a != strarr.length) {
                    d++;
                    a = d;
                    c = k;
                } else {
                    breaks = false;
                }
            }
        }
        return String.valueOf(builder);
    }
}
