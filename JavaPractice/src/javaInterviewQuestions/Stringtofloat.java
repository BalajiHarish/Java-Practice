package javaInterviewQuestions;

import java.text.DecimalFormat;

public class Stringtofloat {

	static String amount = "£ 2,500.50";

	public static String removeAllNonNumerics(String text) {

		float floatnum = Float.parseFloat((text.replaceAll("£", "")).replaceAll(",", "").strip());

		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);

		return df.format(floatnum);
	}

	public static float covertStringToFloat(String text) {

		return Float.parseFloat(text);
	}

	public static float convertStringToFloatwithTwoDecimals(String text) {

		String reformatedString = (text.replaceAll("£", "")).replaceAll(",", "").strip();

		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);

		return Float.parseFloat(df.format(Float.parseFloat(reformatedString)));
	}
	public static void main(String[] args) {

		System.out.println(convertStringToFloatwithTwoDecimals(amount));

	}

}
