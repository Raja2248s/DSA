package productarray;



//Product of array

public class Main
{
	public static void main(String[] args) {
		
		int arr[] = { 10, 3, 5, 6, 2 };
		int n= arr.length;
		
		int leftrray[] = new int[n];
		int rightrray[] = new int[n];
		
		leftrray[0] = 1;
		rightrray[n-1]=1;
		
		for(int i=1;i<n;i++){
		    leftrray[i]= leftrray[i-1]  * arr[i-1];
		}
		
		
		
		for(int i=n-2;i>=0;i--){
		    rightrray[i]=rightrray[i+1]*arr[i+1];
		}
		
	
		for(int i=0;i<n;i++){
		    arr[i] = leftrray[i] * rightrray[i];
		}
		
		System.out.println();
		for(int i=0;i<n;i++){
		    System.out.print(arr[i] + " ");
		}
	}
}