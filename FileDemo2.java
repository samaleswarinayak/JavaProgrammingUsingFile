/*Reading and writing into file  using BufferedOutputStream*/

import java.io.*;
class FileDemo2
{
	public static void main(String args[]) throws IOException
	{
		//Attach keyboard to the DataInputStream object
		DataInputStream dis = new DataInputStream(System.in);
		
		//Attach the file to FileOutputStream object
		FileOutputStream fout = new FileOutputStream("E:\\SPN_CORE-JAVA\\FilePrograms\\MyFile1.txt");
		//Attach FileOutputStream to BufferedOutputStream
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		System.out.println("Enter character value and @ at the end to stop");
		char ch;
		//Read the charcter and write into file
		while((ch=(char)dis.read())!='@')
		{
			bout.write(ch);
		}
		bout.close();
	}
}