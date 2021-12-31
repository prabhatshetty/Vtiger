package javaAssignment;

public class Prog_5 {
	public static void main(String[] args) {
		String s1="hi hello welcome to your home town";
		String[] words=s1.split(" ");
		int count=0;
		 char av = 'h';
		for(int i=0;i<=6;i++) 
		{
			//System.out.println(words[i]);
			String cd = words[i];
			for(int j=cd.length()-1;j>=0;j--)
			{
				
				if(cd.charAt(j)==av)
				{
					//System.out.println(cd.charAt(j));
					count++;
				}
			}
		//System.out.println(count);
	}
		System.out.println("h"+"="+count);
	}
}
