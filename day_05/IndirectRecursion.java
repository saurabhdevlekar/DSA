// package Recursion;

public class IndirectRecursion {

    static int i = 1;

    static void even(int n) {
        if (n > 10) {
            return;
        }
        System.out.println("Even: " + n);
        odd(++n);

    }

    static void odd(int n) {
        if (n > 10) {
            return;
        }
        System.out.println("Odd: " + n);
        even(++n);

    }

    public static void main(String[] args) {
       odd(1);
    }
}