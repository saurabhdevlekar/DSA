// package Sorting;
class Insertion{
    public void showInsertion(int arr[]){
        int size = arr.length;
        int index,value;
        for(int i = 1; i <size; i++){
            value = arr[i];
            index = i;
            while(index > 0 && arr[index-1] > value){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = value;
        }
    }
}
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {10,40,50,30,20};
        Insertion in = new Insertion();
        in.showInsertion(arr);
        System.out.println("Sorted Array");
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}