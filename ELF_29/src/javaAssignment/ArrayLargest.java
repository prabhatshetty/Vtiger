package javaAssignment;

public class ArrayLargest {
	public static void main(String[] args) {
		int[]arr= {28,45,36,87,66,55,99};
		int FL=0;
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>FL)
		{
			FL=arr[i];
		}	
	}
		System.out.println(FL);
	}
}
