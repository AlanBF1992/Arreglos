import java.util.Arrays;

public class MultiplosDeTres {
    public static void main(String[] args) {
        int[] intArgs = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        System.out.println(suma(intArgs));
        double prom = promedio(intArgs);
        if (prom % 1 == 0) {
            System.out.println((int)prom);
        } else {
            System.out.println(prom);
        }
    }

    private static int suma(int[] intArgs) {
        return Arrays.stream(intArgs).filter(x -> x%3 == 0).sum();
    }
    public static double promedio(int[] intArgs) {
        return Arrays.stream(intArgs).filter(x -> x%3 == 0).average().orElse(Double.NaN);
    }

}
