package Codes;
import java.util.*;

public class ArrayAverage 
{
  
 
public static void main (String[]args)
  {
    
 
int n;
    
Scanner sc = new Scanner (System.in);
    
System.out.print ("Enter the number of elements: ");
    
 
n = sc.nextInt ();
    
 
int[] array = new int[n];
    
System.out.println ("Enter the elements of the array: ");
    
for (int i = 0; i < n; i++)
      
      {
	
	  array[i] = sc.nextInt ();
      
} 
 
int sum = 0;
    
 
 
for (int i = 0; i < array.length; i++)
      {
	
sum += array[i];
      
} 
 
double average = sum / n;
    
 
System.out.println ("Average of array : " + average);

 
} 
 
}
