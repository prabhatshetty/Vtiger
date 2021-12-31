package javaAssignment;

import java.util.HashSet;

public class prog_12 {

	public static void main(String[] args) {
		HashSet l1=new HashSet();
		String s1="hi hello welcome hello hi banglore";
		String[] words=s1.split(" ");
for(int i=0;i<words.length;i++) {
	l1.add(words[i]);
}
System.out.println(l1);
	}

}
