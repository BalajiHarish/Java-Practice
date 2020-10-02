package javaInterviewQuestions;

public class StringCut {
	
	static String str = "Credit Note No:CRD-VAT-120519-013";

	public static void main(String[] args) {
		
		String separator =":";
		System.out.println("Substring after separator = "+str.substring(str.indexOf(separator) + separator.length()));
	}

}
