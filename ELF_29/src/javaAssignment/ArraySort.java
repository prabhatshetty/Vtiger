package javaAssignment;

public class ArraySort {
	public static void main (String[] args)
	{
		int[]arr= {10,15,20,25,50};
		for(int j=1;j<arr.length;j++)
		{
			for(int i=1;i<arr.length;i++)
			{
			if(arr[i-1]<arr[i])
			{
				
						int temp=arr[i];
						arr[i]=arr[i-1];
						arr[i-1]=temp;
			}
		}
	}
		for(int k=0;k<arr.length;k++)
		{
		System.out.println(arr[k]);
		
	}
		//System.out.println(arr.length);
	}
	}


