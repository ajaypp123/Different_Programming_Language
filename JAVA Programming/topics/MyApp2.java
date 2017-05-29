import java.applet.*;
import java.awt.*;
/*<applet code= "MyApp2" width=300 height = 500>
</applet>*/
public class MyApp2 extends Applet implements Runnable
{
  Thread t1;
 int x = 100;
int y =100;
   public void init()
	{
	}
   public void start()

	{
	 t1 = new Thread(this);
	 t1.start();
	}
   public void paint(Graphics g)
	{
	  g.setColor(Color.orange);
	  g.fillOval( x,y,40,40);
	}
   public void run()
	{
	  while(true)
	   { if(x==0)
		x=300;
	   else
		x--;
	  try{
	   t1.sleep(100);
	    }catch(Exception ex){}
	  repaint();}
	} 


}