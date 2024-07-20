




/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//Maximum sum subarray using kadane's algorithm 




public class Main
{
	public static void main(String[] args) {
		
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		
		int sum=0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length ;i++){
		    sum+= a[i];
		    max = Math.max(max , sum);
		    if(sum < 0){
		        sum=0;
		    }
		}
		
   System.out.print(max);
		
	}
}