/*WAP to use FileReader class to read data from file character wise.*/

import java.io.FileReader;  
public class FileDemo8
{  
    public static void main(String args[])throws Exception
	{    
		//Attach FileReader to the file
		FileReader fr=new FileReader("F:\\Java Program\\Test\\src\\newfile.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
    }    
}   
