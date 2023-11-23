// package Recursion;

import java.util.Scanner;


public class Recursion {

    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("fact of "+no+" is "+fact(no));
        
    }
    
}