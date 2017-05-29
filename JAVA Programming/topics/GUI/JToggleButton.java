// java

import javax.swing.*;
import java.awt.*;

class tuna extends JFrame
{
	private JToggleButton l1;
	private JToggleButton l2;
	private JToggleButton l3;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		l1 = new JToggleButton();
		add(l1);
		
		l2 = new JToggleButton("JToggleButton");
		add(l2);
		
		l3 = new JToggleButton("JToggleButton", false);
		add(l3);
		
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

