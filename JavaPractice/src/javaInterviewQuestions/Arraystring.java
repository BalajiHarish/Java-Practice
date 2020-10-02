package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraystring {

	public static void main(String[] args) {
		
		List<String> A = new ArrayList<String>();
		List<String> B = new ArrayList<String>();
		List<String> C = new ArrayList<String>();
		List<String> D = new ArrayList<String>();

		A.add("Hi");
		A.add("Hello");

		C.add("Bye");
		C.add("See You");

		D.add("Thank You");

		ArrayList<Object> list = new ArrayList<Object>(); 
		ArrayList<Object> list1 = new ArrayList<Object>(); 

		list.add(new ArrayList<Object>(Arrays.asList("Hi", "Bye", "kk"))); 
		list.add(new ArrayList<Object>(A));
		
		list1.add(new ArrayList<Object>(Arrays.asList("Hi", "Bye", "kk"))); 
		list1.add(new ArrayList<Object>(A));

		System.out.println(list);
		System.out.println(list1);
		
		System.out.println(list.equals(list1));
	//	System.out.println(list.get(1));
//		System.out.println(list.get(0).size());
//		System.out.println(list.get(1).get(0));
	}

}
