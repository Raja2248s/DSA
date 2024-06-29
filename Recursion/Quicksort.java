public class Quicksort {
  public static void main(String[] args) {
    int arr[] ={3 ,1 ,4 ,5 ,2};
    int n= arr.length;
    quicksort(arr, 0, n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i] + " ");
    }
  }

  public static void quicksort(int [] arr , int start , int end){
    if(start >= end){
      return;
    }
    int p = partition(arr , start , end);
    quicksort(arr , start , p-1);
    quicksort(arr , p+1 , end);
  }

  public static int partition(int [] arr , int start , int end){
    int pivot = arr[start];
    int count =0;
    for(int i=start+1;i<=end ;i++){
      if(arr[i] <= pivot){
        count++;
      }
    }
    arr[start]= arr[count+start];
    arr[count + start]=pivot;
    int i= start ;
    int j=end;
    int pivotindex = count+start;

    while(i<pivotindex && j>pivotindex){
      while(arr[i] <pivot){
        i++;
      }
      while(arr[j] > pivot){
        j--;
      }
      if(i < pivotindex && j >pivotindex){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
      }
    }
    return count+start;

  }
}
