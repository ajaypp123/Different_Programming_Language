import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;


class myfile
{
   
	public static void main(String[] args) throws IOException 
{

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


        try {
            in = new FileInputStream("abc.txt");
            out = new FileOutputStream("xyz.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
				//System.out.println(out.write(c));
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}