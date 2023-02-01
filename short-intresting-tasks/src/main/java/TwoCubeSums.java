public class TwoCubeSums {

    public static boolean hasTwoCubeSums(int n) {
        int a = 1;
        int b = (int) Math.cbrt(n);;
        int score = 0;
        double sum;
        boolean result = false;
        while (score < 2 && a < Math.cbrt(n) && b > 0 && b > a) {
            while (b > a) {
                sum = Math.pow(a, 3) + Math.pow(b, 3);
                a++;
                if ((int) sum == n) {
                    score++;
                }
            }
            b--;
            a = 1;
        }
        if(score >= 2) {
            result = true;
        }
        return result;
    }
}
