// java

import javax.swing.*;
import java.awt.*;

class tuna extends JFrame
{
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		l1 = new JLabel();
		add(l1);
		
		l2 = new JLabel("Label Name: label");
		add(l2);
		
		//l3 = new JLabel("Label Name: label", LEFT);
		//add(l3);
		
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

