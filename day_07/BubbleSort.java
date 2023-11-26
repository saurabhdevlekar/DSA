
package Sorting;

public class BubbleSort {
        int[] Swap(int[] arr, int i, int j) {
    
           int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                 return arr;
        }
    public int[] sort(int[] arr){
        for(int i=0;i<arr.length-1; i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    Swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[]={25,5,20,10,50};
        bs.sort(arr);    
        for(int i:arr){
            System.out.println(i);
        }
    }
 
}
