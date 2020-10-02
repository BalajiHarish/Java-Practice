package javaInterviewQuestions;

public class globallocal {


		static int a = 10;
		static int b = 20;

		public static void localtest(int a, int b){

		System.out.println(a+b);

		}

		public static void main(String[] args){


		System.out.println(a + b);
		int a= 100, b=200;

		localtest(a, b);

		}
		}

