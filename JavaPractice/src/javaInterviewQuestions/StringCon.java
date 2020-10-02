package javaInterviewQuestions;

public class StringCon {

	public static void main(String[] args) {
		
		String Before = "//div[@role='presentation']/div[@class!='ui-grid-header']/div/div/div/div[3]/div[";
		
		String After = "]/parent::div/preceding-sibling::div/div[@class='ui-grid-cell-contents c-alias']";
		
		String Constr = "contains(text(),'Kane')";
		
		int i = 3;
		int count = i;
		String newstr = "";
		
		if(i==1) {
			
			newstr = newstr + Constr;
			
		}
		
		else if(i>1) {
			
			for(int j=1; j<=i; j++) {
				
				
				newstr = newstr + Constr;
				
				if(j != count) {
					
					newstr = newstr + " or ";
				}
				
				
			}
		}
		
//		StringBuffer sb= new StringBuffer(newstr);
//	      sb.deleteCharAt(sb.length()-5);
      System.out.println("Output :" +newstr );
		System.out.println("Final Outcome :" + Before + newstr + After);

	}

}
