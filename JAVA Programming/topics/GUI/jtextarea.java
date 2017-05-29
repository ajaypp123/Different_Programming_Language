// java

import javax.swing.*;
import java.awt.*;

class tuna extends JFrame
{
	//private JTextArea l1;
	//private JTextArea l2;
	//private JTextArea l3;
	private JTextArea l4;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		//l1 = new JTextArea();
		//add(l1);
		
		//l2 = new JTextArea("JTextArea");
		//add(l2);
		
		//l3 = new JTextArea(50,50);
		//add(l3);
		
		l4 = new JTextArea("Enter Text Here :" ,50 ,50);
		add(l4);
		
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

