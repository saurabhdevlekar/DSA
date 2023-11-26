// package Sorting;

public class SelectionSort {

    private static int Swap(int[] arr, int i, int j) {
    
           int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                 return arr[i];
    }

    public static void main(String[] args) {

        int arr[] = {10, 30, 4, 20, 3};
        int size = arr.length;
        for (int i = 0; i <= size - 1; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])
                {
                    Swap(arr,i,j);

                 
                }
    
            }
            System.out.println(arr[i]);
        }

    }
}