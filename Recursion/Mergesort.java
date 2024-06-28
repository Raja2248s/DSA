

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    int a[] = { 5 , 4 , 6 , 7};
    mergesort(a, 0 , 3);
    for(int i=0;i<4;i++){
      System.out.print(a[i]+ " ");
    }
    
  }

  public static void mergesort(int a[] , int start , int end){

    if(start >= end){
      return ;
    }
    int mid = (start + end)/2;
    // left hand sorting
    mergesort(a , start , mid);

    // right hand sorting 
    mergesort(a , mid +1 , end);

    // merging two sorted array
    merge(a, start, end);
  }

  public static void merge( int a[] , int start , int end){

    int mid = (start + end)/2;

    int left = mid-start+1;
    int right = end - mid;

    int leftarr[] = new int [left];
    int rightarr[] = new int [right];


    int mainarrayindex=start;
    for(int i=0;i<left;i++){
        leftarr[i] = a[mainarrayindex++];
    }

    for(int i=0;i<right ; i++){
      rightarr[i]= a[mainarrayindex++];
    }
   int leftindex=0;
   int rightindex=0;
  mainarrayindex = start;

    while(leftindex < left && rightindex < right){
      if(leftarr[leftindex] < rightarr[rightindex]){
        a[mainarrayindex++] = leftarr[leftindex++];
          }
      else{
        a[mainarrayindex++] = rightarr[rightindex++];
      }
    }
    
        while(leftindex < left){
          a[mainarrayindex++] = leftarr[leftindex++];
        }
    while(rightindex < right){
      a[mainarrayindex++] = rightarr[rightindex++];
    }

    
    
  }

}
