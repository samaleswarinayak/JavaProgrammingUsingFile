/*Use of FileReader class in Java */

import java.io.*;

class FileDemo5
{
	public static void main(String args[]) throws IOException
	{
		//Declare the string
		String str;
		//Attach FileReader class to the file
		FileReader fr = new FileReader("E:\\SPN_CORE-JAVA\\FilePrograms\\MyFileWrite.txt");
		BufferedReader br = new BufferedReader(fr);
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		fr.close();
	}
}