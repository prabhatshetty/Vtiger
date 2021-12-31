package javaAssignment;

public class Prog_6{
	public static void main(String[] args) {
		String s1="my name is mohan and i am from manglore";
		int count = 0;
		char string[]=s1.toCharArray();
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length()-1;j++)
			{
				if(string[i]==string[j])
				{
					count++;
					//System.out.println(string[i]);

				}
			}

		}

		System.out.println(count);
	}
}