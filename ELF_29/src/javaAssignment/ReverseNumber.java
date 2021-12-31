package javaAssignment;

public class ReverseNumber {
	public static void main(String[] args) {
		int no=123145;
		int a=0;
		int b=0;
		while(no!=0)
		{
			a=no%10;	
			b=b*10+a;
			no=no/10;

		}
		System.out.println(b);
	}

}
