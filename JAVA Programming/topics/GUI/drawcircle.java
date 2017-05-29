import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
/*
<applet code = "drawcircle" width=500 height=250>
</applet>
*/
public class drawcircle extends Applet implements Runnable
{
	Thread t1;
	 int x=0;
	int flag=1;
		public void start()
		{
		t1=new Thread(this);
		t1.start();
		}

	public void init()
	{
	
	}
	public void run()
	{
		while(true)
		{
			
			
	if(flag==1)
	{	
	if(x>400)
	{
		x=x-20;
		flag=0;
	
	}
	else
	x=x+20;
	}
	else if(flag==0)
	{
 	if(x>0)
	{
		x=x-20;
		flag=0;

	}
	else
	x=x+20;
	
}
			try
			{
				
				Thread.sleep(500);
			}catch(Exception e)
			{}

		repaint();		
		}
	}

	public void paint(Graphics g)
	{
		setForeground(Color.red);
		g.drawOval(50,50,70,70);
		g.drawRect(50,150,70,90);
		g.fillOval(x,50,70,70);
		g.fillRect(x,150,70,90);
		
	
	}
		
		
		
		
		
	
}