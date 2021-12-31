package javaAssignment;

public class ArrayFirstThreeMax {
	public static void main(String[] args) {
		int[]arr= {28,45,36,87,66,55,99};
		int FL=0;
		int SL=0;
		int TL=0;
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>FL)
		{
			SL=FL;
			FL=arr[i];
		}else 
			if(arr[i]>SL)
		{
				TL=SL;
			SL=arr[i];
		}
			else
			{
				TL=arr[i];
			}
	}
		System.out.println(FL);
		System.out.println(SL);
		System.out.println(TL);
	}
}

