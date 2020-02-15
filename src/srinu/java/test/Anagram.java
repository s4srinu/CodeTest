package srinu.java.test;

import java.util.Arrays;

public class Anagram {

	 public static void main(String[] args)
	    {
	        isAnagram("Mother In Law", "Hitler Woman");
	    }
	
	static void isAnagram(String s1, String s2)
    {
        //Removing white spaces from s1 and s2 and changing case to lower
 
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
 
        //Initially setting status as true
 
        
        boolean status = true;
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Converting copyOfs1 to char array
 
            char[] s1ToArray = copyOfs1.toCharArray();
            System.out.println("abs"+s1ToArray.toString());
            Arrays.sort(s1ToArray);
            System.out.println("abs"+s1ToArray);
            
            
            //Checking whether each character of s1ToArray is present in copyOfs2
 
            for (char c : s1ToArray)
            {
                int index = copyOfs2.indexOf(c);
 
                if(index != -1)
                {
                    //If character is present in copyOfs2, removing that char from copyOfs2
 
                    copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                }
                else
                {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop
 
                    status = false;
 
                    break;
                }
            }
        }
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
   
}
