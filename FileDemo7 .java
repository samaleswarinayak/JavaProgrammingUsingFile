/*WAP to use FileWriter class to write data into file character wise.*/


import java.io.*;
import java.util.*;
public class FileDemo7 
{
	public static void main(String args[]) throws IOException
	{
		//Input a string
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.next();
		//Attach file to FileWriter
		FileWriter fw=new FileWriter("F:\\Java Program\\Test\\src\\newfile.txt");
		//Read character wise from string and write into FileWriter
		for(int index=0;index<str.length();index++)
		{
			fw.write(str.charAt(index));
		}
		fw.close(); 	
	}   
}
