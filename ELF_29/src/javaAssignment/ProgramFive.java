package javaAssignment;

public class ProgramFive {
	public static void main(String[] args) {
		int count=0;
		String s1="hi hello welcome to your home town";
		//String[]arr=s1.split("");
		//for(int i=arr.length-1;i>=0;i--)
		for(int i=s1.length()-1;i>=0;i--)
		{
				if(s1.charAt(i)=='h')
				{
					count++;
				} 
				
		}
		System.out.println(count);
	}
}
