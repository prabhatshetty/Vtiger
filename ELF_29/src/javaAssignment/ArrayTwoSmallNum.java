package javaAssignment;

public class ArrayTwoSmallNum {
	public static void main(String[] args) {
		int[]arr= {45,36,87,66,55,99,28};
		int SML=0;
		int SMLL=0;
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]<=arr[0])
		{
			SMLL=SML;
			SML=arr[i];
		}else
		{
		SMLL=arr[i];	
		}
		}
		System.out.println(SML);
		System.out.println(SMLL);
	}
	}
