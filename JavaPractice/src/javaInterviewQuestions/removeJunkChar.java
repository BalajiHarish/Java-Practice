package javaInterviewQuestions;

public class removeJunkChar {

	public static void main(String[] args) {
		
		String str = "!@#$% Selenium Testing )(*&^^";
		
		//Using Regular Expression: [^a-zA-Z0-9]
		
		str = str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(str);

	}

}
