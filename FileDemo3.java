//Read contents from file

import java.io.*;
class FileDemo3
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = new FileInputStream("E:\\SPN_CORE-JAVA\\FilePrograms\\MyFile1.txt");
		int num;
		System.out.println("Contents of file is");
		while((num = fin.read())!= -1)
		{
			System.out.print((char)num);
		}
		fin.close();
	}
}