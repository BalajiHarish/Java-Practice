package javaInterviewQuestions;

public class ReverseInterger {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 20;
		int c = 50;
		int d = 66;
		
		//using temp variable
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Reverse a & b : " + a + " & " + b);
		
		//without using temp variable
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("After Reverse c & d : " + c + " & " + d);

	}

}
