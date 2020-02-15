package srinu.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {
	public static void main(String[] args) {
		String a="__";
		Pattern p=Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]+");
		Matcher m=p.matcher(a);
		
		if(m.find() && m.group().equals(a)){
			System.out.println("valid");
		}else{
			System.out.println("not valid");
		}

		
	}
}
