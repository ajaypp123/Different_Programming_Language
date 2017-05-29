// java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class tuna extends JFrame
{
	private JTextField l1;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		l1 = new JTextField("sentense:",20);
		l1.setFont(new Font("Serif", Font.PLAIN ,14));
		add(l1);
		
		boldbox = new JCheckBox("bold");
		add(boldbox);
		
		italicbox = new JCheckBox("italic");
		add(italicbox);
		
		handlerclass obj = new handlerclass(); 
		boldbox.addItemListener(obj);
		italicbox.addItemListener(obj);
		
	}
	
	private class handlerclass implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			Font font = null;
			 
			if(boldbox.isSelected() && italicbox.isSelected())
			{
				font = new Font("Serif", Font.BOLD + Font.ITALIC , 14);
			}
			else if(boldbox.isSelected())
			{
				font = new Font("Serif", Font.BOLD, 14);
			} 
			else if(italicbox.isSelected())
			{
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else
			{
				font = new Font("Serif", Font.PLAIN, 14);
			}
			
			l1.setFont(font);
		}
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

