package javaInterviewQuestions;

import java.io.File;

public class PDFtest {

	public static void main(String[] args) {
		
		File source = new File(".pdf"); 
		long lastModified = source.lastModified(); 
		String time = String.valueOf(lastModified); 
		System.out.printf("file %s was last modified at %s %n", source.getName(), time);

	}

}
