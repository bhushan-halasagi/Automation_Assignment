package Codes;
import java.util.*;

class Palindrome
{
  
public static void main (String[]args)
  {
    
 
String str = "", reverseStr = "";
    
Scanner s = new Scanner (System.in);
    
System.out.print ("Enter a string: ");
    
str = s.nextLine ();
    
 
int strLength = str.length ();
    
 
for (int i = (strLength - 1); i >= 0; --i)
      {
	
reverseStr = reverseStr + str.charAt (i);
    
} 
 
if (str.toLowerCase ().equals (reverseStr.toLowerCase ()))
      {
	
System.out.println ("String is a Palindrome String.");
      
}
    
    else
      {
	
System.out.println ("String is not a Palindrome String.");
      
}
  
}

}
