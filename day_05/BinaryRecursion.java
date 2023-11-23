// package Recursion;

public class BinaryRecursion {

    public static int fibo(int n) {

        if (n <= 1) {
            return n;
        }
    
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

        for (var i = 0; i <= 5; i++) {
            System.out.println(fibo(i) + " ");
        }

    }
}