// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Bubblesort {
  public static void main(String[] args) {
    int a[] = {2 , 5, 1,6,9};
    sortedArray(a , 5);
    for(int i=0;i<5;i++){
      System.out.println(a[i]);
    }
  }

 public static void sortedArray(int a[]  , int n){
    if(n==0 || n==1){
      return ;
    }
   for(int i=0;i<n-1;i++){
     if(a[i] >= a[i+1]){
       swap(a , i , i+1);
     }
   }
  sortedArray(a , n-1);
 }
  public static void swap(int [] a , int i , int j){
    int temp = a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
