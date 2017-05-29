import java.applet.*;
import java.awt.*;

/*
<applet code = "myapp" width=500 height=400> 
</applet>
*/

public class myapp extends Applet
{
	public void init(){}
	
	public void paint(Graphics g)
	{
		g.drawRect(50,50,100,100);
		g.drawOval(50,50,100,100);
		
	}
}