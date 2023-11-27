public class MergeSort {
    void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start+1];

        int i, j, k;
        i=start;
        j=mid+1;
        k=0;

        // Compare and insert smaller element into temp
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]= arr[i
                ];
                k++;
                i++;
            }
            else{
                temp[k]= arr[j];
                k++;
                j++;
            }
        }

        // for remaining elements of first array
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            j++;
        }
        // for remaining elemennts of second array
        while(j<=end){
            temp[k]= arr[j];
            j++;
            k++;
        }
        // copy temp to original array
        k=0;
        for(i=start; i<=end; i++){
            arr[i]=temp[k++];
        }
    }
    void mergeSort(int arr[], int start, int end){
        if(start<end){
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }   
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = {50, 10, 30, 60, 80, 20, 100};
        ms.mergeSort(arr, 0, arr.length-1);

        for (int no : arr) {
            System.out.println(no);
        }
    }
}