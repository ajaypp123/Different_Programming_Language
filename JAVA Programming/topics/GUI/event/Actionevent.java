// java

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

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
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("Enter text here :");
		add(item2);
		
		item3 = new JTextField("Uneditable text", 20);
		item3.setEditable(false);
		add(item3);
		
		password = new JPasswordField(20);
		add(password);
		
		handlerclass handlerobj = new handlerclass(); 
		
		item1.addActionListener(handlerobj);
		item2.addActionListener(handlerobj);
		item3.addActionListener(handlerobj);
		password.addActionListener(handlerobj);	
	}
	
	private class handlerclass implements ActionListener
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
}

class myclass1
{
	public static void main(String []args)
	{
		tuna obj = new tuna();
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350,200);
		obj.setVisible(true);
	}
}

