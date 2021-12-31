package javaAssignment;

import java.util.ArrayList;

public class ArrayListRev {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		{
			l1.add("My");
			l1.add("Name");
			l1.add("Is");
			l1.add("Yourname");


			for(int i=l1.size()-1;i>=0;i--) {
				Object ab = l1.get(i);
				System.out.print(" "+ab);

			}

		}
	}

}
