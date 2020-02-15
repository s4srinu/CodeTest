package srinu.java.test;

public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
		
		//String str2 = str1.replaceAll("\\s", "");

		char[] chars = str1.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < chars.length; i++)

		{
			if ((chars[i] != ' ') && (chars[i] != '\t'))
			{
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
		removeAllWhiteSpace(str1);
	}
	
	public static void removeAllWhiteSpace(String str){
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String str1: strArr){
		sb.append(str1);

		}
		System.out.println("String without Space ="+sb);
		}
	
}
