/*Reading and writing into file*/

import java.io.*;
class FileDemo1
{
	public static void main(String args[]) throws IOException
	{
		//Attach keyboard to the DataInputStream object
		DataInputStream dis = new DataInputStream(System.in);
		
		//Attach the file to FileOutputStream object
		FileOutputStream fout = new FileOutputStream("E:\\SPN_CORE-JAVA\\FilePrograms\\MyFile.txt");
		
		System.out.println("Enter character value and @ at the end to stop");
		char ch;
		//Read the charcter and write into file
		while((ch=(char)dis.read())!='@')
		{
			fout.write(ch);
		}
		fout.close();
	}
}