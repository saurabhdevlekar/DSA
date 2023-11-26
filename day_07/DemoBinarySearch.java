// package Day_07;

public class DemoBinarySearch
{
    int BinarySearch1(int arr[],int start,int end,int key)
    {
       int mid;
       while(start <=end)
       {
          mid=(start+end)/2;
          
          if(arr[mid]==key)
              return 1;
          if(arr[mid] < key)
              start=mid+1;
          else
              end=mid-1;
       }
        return 0;
    }
    public static void main(String[] args) 
    {
      int arr[]={10,23,45,70,90,100,111,123};
      int key=10;
      int start =0;
      int end =arr.length-1;
      DemoBinarySearch bs=new DemoBinarySearch();
      if(bs.BinarySearch1(arr, start, end, key)==1)
      {
          System.out.println("Search Found");
      }
      else
            System.out.println("NOt Found");
    }
}