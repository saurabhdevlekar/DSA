// package searching;

import java.util.Scanner;


public class LinerSearch {

    public int linearSearch(int arr[],int size,int key)
    {
        int i;
        for( i=0;i<size;i++){
            if(arr[i]==key)
                return 1;
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int page_number[]={12,212,44,33};
        //int key=44;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any key for searching in array:");
        int n=sc.nextInt();
        LinerSearch o=new LinerSearch();
        
        if(o.linearSearch(page_number, page_number.length, n)==1)
        {
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
    
}