import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.*;
import java.io.FileWriter;
import java.util.*;


class myfile
{
   
	public static void main(String[] args) throws IOException 
	{
		String l;
		Scanner a = new Scanner(System.in);
		l = a.nextLine();
        
		//File f = new File("test.txt");
		//f.createNewFile();
		File f1 = new File("pqr.txt");
		f1.createNewFile();

	    FileWriter fstream = new FileWriter("abc.txt");
        BufferedWriter obj = new BufferedWriter(fstream);
        obj.write(l);
	    obj.close();

		FileInputStream in = null;
        FileOutputStream out = null;
		
        String fileName = "abc.txt";

        String line = null;
		FileReader fileReader = new FileReader(fileName);
		 
        BufferedReader bufferedReader =  new BufferedReader(fileReader);
               
         while((line = bufferedReader.readLine()) != null)
        {
                System.out.println(line);
	     }


        
		
		try 
		{
            in = new FileInputStream("abc.txt");
            out = new FileOutputStream("xyz.txt");
            int c;

            while ((c = in.read()) != -1)
		{
                out.write(c);
         }

        } 
		finally 
		{
            if (in != null) 
			{
                in.close();
            }
            if (out != null) 
			{
                out.close();
            }
        }
	
     f1.delete();
    }
}