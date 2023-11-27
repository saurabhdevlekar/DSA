import java.util.HashMap;

public class QuestionThree {
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, fibValue);
            return fibValue;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to calculate Fibonacci of a different number
        long result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
