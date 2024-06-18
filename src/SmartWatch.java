import java.util.Arrays;

public class SmartWatch {
    public static void main(String[] args) {
        int[] intArgs = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        intArgs = clearSteps(intArgs);
        System.out.println(promedio(intArgs));
    }

    private static int[] clearSteps(int[] intArgs) {
        return Arrays.stream(intArgs).filter(x -> x >= 200 && x <= 100000).toArray();
    }

    public static double promedio(int[] intArgs) {
        return Arrays.stream(intArgs).average().orElse(Double.NaN);
    }
}
