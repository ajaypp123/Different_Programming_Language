
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class mouse extends JFrame
{
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public mouse()
	{
		super("title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar = new JLabel("Default");
		add(statusbar,BorderLayout.SOUTH);
		
		handlerclass hobj = new handlerclass();
		mousepanel.addMouseListener(hobj);
		mousepanel.addMouseMotionListener(hobj);
		
	}
	
	private class handlerclass implements MouseListener,MouseMotionListener
	{
		public void mouseClicked(MouseEvent eve)
		{
			statusbar.setText(String.format("Clicked at : %d ,%d",eve.getX(), eve.getY()));
		}
		
		public void mousePressed(MouseEvent eve)
		{
			statusbar.setText("Mouse Pressed");
		}
		
		public void mouseReleased(MouseEvent eve)
		{
			statusbar.setText("Mouse Released");
		}
		
		public void mouseEntered(MouseEvent eve)
		{
			statusbar.setText("Mouse Entered");
			mousepanel.setBackground(Color.RED);
		}
		
		public void mouseExited(MouseEvent eve)
		{
			statusbar.setText("Mouse left the window");
			mousepanel.setBackground(Color.GREEN);
		}
		
		//mousemotion method
		public void mouseDragged(MouseEvent eve)
		{
			statusbar.setText("Mouse dragged");
		}
		
		public void mouseMoved(MouseEvent eve)
		{
			statusbar.setText("Mouse moved");
		}
	}
}

class myclass
{
	public static void main(String []args)
	{
		mouse obj = new mouse();
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350,200);
		obj.setVisible(true);
	}
}