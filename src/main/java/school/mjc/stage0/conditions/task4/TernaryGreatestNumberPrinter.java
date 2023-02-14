package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        int result = first > second ? first : second;
        System.out.println(result);
    }
}
