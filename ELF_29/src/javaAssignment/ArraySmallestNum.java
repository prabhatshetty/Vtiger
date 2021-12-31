package javaAssignment;

public class ArraySmallestNum {
	public static void main(String[] args) {
		int[]arr= {28,45,36,87,66,55,99};
		int SML=0;
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]<=arr[0])
		{
			SML=arr[i];
		}
		
	}
		System.out.println(SML);
	}

}
