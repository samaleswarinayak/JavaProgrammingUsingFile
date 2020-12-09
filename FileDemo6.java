/*WAP to write String data in Java FileOutputStream. */

import java.util.*;
import java.io.*;   
class FileDemo6 
{  
 public static void main(String args[]) throws IOException
 {
	FileOutputStream fout= new FileOutputStream("F:\\JavaProgram\\Test\\src\\myfilestring.txt");
	System.out.println("Enter the string");
	String str;
	Scanner sc=new Scanner(System.in);
	str=sc.next();
	byte bt[]=str.getBytes();
	fout.write(bt);
	fout.close();
	sc.close();
} 
}
