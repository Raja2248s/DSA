// /******************************************************************************

//                             Online Java Compiler.
//                 Code, Compile, Run and Debug java program online.
// Write your code in this editor and press "Run" button to execute it.

// *******************************************************************************/
// // Hashmap method 

// //O(n);

// import java.util.ArrayList;
// import java.util.HashMap;
// class Duplicates
// {
// 	public static void main(String[] args) {
// 	         int a[] = {1, 2, 3, 6, 3, 6, 1};
	         
// 	         HashMap<Integer , Integer> map = new HashMap<>();
// 	         ArrayList<Integer> elements = new ArrayList<>();
	         
// 	         for(int i=0;i<a.length;i++){
// 	             if(map.containsKey(a[i])){
// 	                 elements.add(a[i]);
// 	             }
// 	             else{
// 	                 map.put(a[i] , 1);
// 	             }
// 	         }
	         
// 	         for(int i : elements){
// 	             System.out.println(i);
// 	         }
// 	}
// }



// Auxiliary array

// /O(n);

import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	         int a[] = {1, 2, 3, 6, 3, 6, 1};
	         
	         int arr[] = new int[a.length];
	         ArrayList<Integer> elements = new ArrayList<>();
	         
	         for(int i:a){
	             arr[i]++;
	             if(arr[i]>1){
	                 elements.add(i);
	             }
	         }
	         
	         for(int i : elements){
	             System.out.println(i);
	         }
	}
}