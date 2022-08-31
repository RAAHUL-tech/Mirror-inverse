package mirrorinverse;

import java.util.Scanner;

public class inverse {
	
   static boolean isMirrorInverse(int arr[], int n) 
	{ 
	    for (int i = 0; i < n; i++) 
	    { 
	        // If condition fails for any element 
	        if (arr[arr[i]] != i) 
	            return false; 
	    } 
	    // Given array is mirror-inverse 
	    return true; 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[100];  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=s.nextInt();
		System.out.println("Enter array elements..");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		if (isMirrorInverse(arr,n))  
		System.out.println("Yes");  
		else  
		System.out.println("No");  

	}

}
