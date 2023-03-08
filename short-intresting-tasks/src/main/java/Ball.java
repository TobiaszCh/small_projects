public class Ball {
    public static int maxBall(int v0) {
        double t = 0;
        double h;
        double g = 9.81;
        double v = v0 * 0.27777777777;
        double result = -1;
        double result1 = -1;
        boolean bol = true;
        while (bol) {
            h = v * t - 0.5 * g * t * t;
            result1 ++;
            if(result > h) {
                result1--;
                bol = false;
            }
            result = h;
            t += 0.1;
        }
        return (int) result1;
    }
}
