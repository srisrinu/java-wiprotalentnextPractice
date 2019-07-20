/* Basic Java program that reverses an array*/

public class Arr { 

	/* function that reverses array and stores it 
	in another array*/
	static void reverse(int arr[], int n) 
	{ 
		int[] a = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			a[j - 1] = arr[i]; 
			j = j - 1; 
		} 

		/*printing the reversed array*/
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(a[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {1,2,3,4,5}; 
		reverse(arr, arr.length); 
	} 
} 
