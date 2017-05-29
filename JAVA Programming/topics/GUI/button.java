// java

import javax.swing.*;
import java.awt.*;

class tuna extends JFrame
{
	private JButton b1;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		b1 = new JButton("Click");
		add(b1);
		
	}
	
}

class myclass
{
	public static void main(String []args)
	{
		tuna obj = new tuna();
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350,200);
		obj.setVisible(true);
	}
}

