public class HeapSort{
    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    void buildHeap(int arr[], int size){
        int i;
        for(i=size/2; i>=0; i--){
            heapify(arr, i, size);
        }
    }
    void heapify(int arr[], int index, int size){
        int left = 2*index+1;
        int right = left+1;

        int max=index;
        if(left<=size && arr[left]>arr[max]){
            max = left;
        }
        if(right<=size && arr[right]>arr[max]){
            max = right;
        }
        if(index != max){
            swap(arr, max, index);
            heapify(arr, max, size);
        }
    }
    void heapSort(int arr[], int size){
        buildHeap(arr, size);
        while(size>0){
            swap(arr, 0, size);
            size--;
            heapify(arr, 0, size);                                                  
        }
    }

    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        int arr[] = {50, 10, 30, 60, 80, 20};

        hs.heapSort(arr, arr.length-1);

        for(int element: arr){
            System.out.println(element);
        }
    }
}