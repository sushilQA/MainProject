package automationProject;

import java.util.Stack;

public class StringMethods {
	
	public String reverseString(String str)
	{
		String result = "";
		char ch ;
		for(int i=0 ; i<str.length();i++) {
			ch = str.charAt(i);
			result = ch+result;
		}
		
		return result;
	}
	
	public void reverseWords(String str)
	{
	    Stack<Character> st=new Stack<Character>();
	    for (int i = 0; i < str.length(); ++i) {
	        if (str.charAt(i) != ' ')
	            st.push(str.charAt(i));
	  
	        else {
	            while (st.empty() == false) {
	                System.out.print(st.pop());
	                 
	            }
	            System.out.print(" ");
	        }
	    }
	  
	    // Since there may not be space after
	    // last word.
	    while (st.empty() == false) {
	        System.out.print(st.pop());
	         
	    }
	}
	
	/*public static void main(String[] args) {
		StringReverse str = new StringReverse();
		str.reverseWords("SIHT SI LIHSUS");
		
	}*/

}
