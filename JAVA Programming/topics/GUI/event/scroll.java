// java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class tuna extends JFrame
{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField password;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		//
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("Enter text here :");
		add(item2);
		
		item3 = new JTextField("Uneditable text", 20);
		item3.setEditable(false);
		add(item3);
		
		password = new JPasswordField(20);
		add(password);
		//
		
		//
		Scrollbar s = new Scrollbar();
		//s.setPreferredSize(new Dimension(20,500));
        add(s,BorderLayout.EAST);
		//
		
		//action event class
		handlerclass1 handlerobj = new handlerclass1(); 
		item1.addActionListener(handlerobj);
		item2.addActionListener(handlerobj);
		item3.addActionListener(handlerobj);
		password.addActionListener(handlerobj);	
		
		//adjestment event class
		handlerclass2 handlerobj2 = new handlerclass2(); 
		s.addAdjustmentListener(handlerobj2);
		
	}
	
	private class handlerclass1 implements ActionListener
	{
		public void actionPerformed(ActionEvent eve)
		{
			String s1 = "";
			
			if(eve.getSource() == item1)
			{
				s1 = String.format("Field 1 : %s ", eve.getActionCommand() );
			}
			else if(eve.getSource() == item2)
			{
				s1 = String.format("Field 2 : %s ", eve.getActionCommand() );
			}
			else if(eve.getSource() == item3)
			{
				s1 = String.format("Field 3 : %s ", eve.getActionCommand() );
			}
			else if(eve.getSource() == password)
			{
				s1 = String.format("Field password is : %s ", eve.getActionCommand() );
			}
			
			JOptionPane.showMessageDialog(null, s1);
		}
	}
	
	private class handlerclass2 implements AdjustmentListener
	{
		public void adjustmentValueChanged(AdjustmentEvent ae)
		{
			setTitle("Current value: " +ae.getValue());
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

