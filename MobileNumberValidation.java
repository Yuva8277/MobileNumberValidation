import java.util.regex.*; 
import java.util.Scanner; 
public class MobileNumberValidation  
{  
//function to check if the mobile number is valid or not      
public static boolean isValidMobileNo(String str)  
{  
//(0/91): number starts with (0/91)  
//[7-9]: starting of the number may contain a digit between 0 to 9  
//[0-9]: then contains digits 0 to 9  
Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
Matcher match = ptrn.matcher(str);  
return (match.find() && match.group().equals(str));  
}  
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Mobile No: ");   
String str =sc.next(); 
if (isValidMobileNo(str))  
System.out.println("It is a valid mobile number.");   
else  
System.out.println("Entered mobile number is invalid.");      
}  
}   