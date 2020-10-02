package javaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Java";
		
		//using for loop
		int length = str.length();
		String reverseString = "";
		
		for(int i=length-1; i>=0; i--) {
			
			reverseString = reverseString + str.charAt(i);
		}
		
		System.out.println("The reverse of string is : " + reverseString);
		
		//using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("The reverse of string is : " + sb.reverse());
	}

}
