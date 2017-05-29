import java.io.*;
import javax.swing.*;
class ioput
{
		public static void main(String a[])throws Exception
		{
			try{
				FileInputStream fi = new FileInputStream("f1.txt");
				FileOutputStream fo = new FileOutputStream("f2.txt");
				int i;
				while((i=fi.read()) != -1)
				{
					
				
					System.out.println((char)i);
					fo.write(i);
					
/*					boolean b1,b2;
					if((b1 =(fi.exists()))= true)
					{
						System.out.println("F1 File is Created");
					}
					if((b2 =(fo.exists()))= true)
					{
						System.out.println("F2 File is Created");
					}
*/				}
				fo.close();
				JOptionPane.showMessageDialog(null,"Shantabai","1 file copied",JOptionPane.PLAIN_MESSAGE); 
 
			}catch(Exception e){System.out.println(e);}
		}

}