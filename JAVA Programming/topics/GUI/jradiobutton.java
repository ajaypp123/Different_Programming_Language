// java

import javax.swing.*;
import java.awt.*;

class tuna extends JFrame
{
	private JRadioButton l1;
	private JRadioButton l2;
	private JRadioButton l3;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		l1 = new JRadioButton();
		add(l1);
		
		l2 = new JRadioButton("JRadioButton");
		add(l2);
		
		l3 = new JRadioButton("JRadioButton",false);
		add(l3);
		
		
	}
	
}

class myclass
{
	public static void main(String []args)
	{
		tuna obj = new tuna();
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(500,400);
		obj.setVisible(true);
	}
}

