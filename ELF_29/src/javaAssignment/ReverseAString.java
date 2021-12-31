package javaAssignment;

public class ReverseAString {

	public static void main(String[] args) {
		String s1="ELF2021SELENIUM";
		String rev=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			//System.out.println(s1.length());
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
