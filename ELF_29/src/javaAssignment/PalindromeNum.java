package javaAssignment;

public class PalindromeNum {
	public static void main(String[] args) {
		int no=1234321;
		int copy=no;
		int a=0;
		int b=0;
		while(no!=0)
		{
			a=no%10;	
			b=b*10+a;
			no=no/10;

		}
		System.out.println(b);
		if(copy==b)
		{
			System.out.println("its an palindrome Number");
		}
		
	}

	

}
