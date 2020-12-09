/*Use of FileWriter class in Java */

import java.io.*;
import java.util.*;
class FileDemo4
{
	public static void main(String args[]) throws IOException
	{
		//Input the string
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		str = sc.next();
		//Attach the FileWriter to the file
		FileWriter fw = new FileWriter("E:\\SPN_CORE-JAVA\\FilePrograms\\MyFileWrite.txt");
		//Write into file
		while(!str.equals("stop"))
		{
			fw.write(str);
			System.out.println("Enter string to continue else enter stop to discontinue");
			str = sc.next();
		}
		fw.close();
	}
}