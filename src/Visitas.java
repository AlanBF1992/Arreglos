import java.util.Arrays;

public class Visitas {
    public static void main(String[] args) {
        int[] intArgs = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        double prom = promedio(intArgs);
        if (prom % 1 == 0) {
            System.out.println((int)prom);
        } else {
            System.out.println(prom);
        }
    }

    private static double promedio(int[] intArgs) {
        return Arrays.stream(intArgs).average().orElse(Double.NaN);
    }
}