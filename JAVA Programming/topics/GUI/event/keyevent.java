// java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class tuna extends JFrame
{
	private JLabel statusbar;
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JTextField item4;
	private JPasswordField password;
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		statusbar = new JLabel("Default");
		add(statusbar,BorderLayout.SOUTH);
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("Enter text here :");
		add(item2);
		
		item3 = new JTextField("Uneditable text", 20);
		item3.setEditable(false);
		add(item3);
		
		password = new JPasswordField(20);
		add(password);
		
		item4 = new JTextField("Uneditable text", 20);
		item4.setEditable(false);
		add(item4);
		
		handlerclass handlerobj = new handlerclass(); 
		item1.addActionListener(handlerobj);
		item2.addActionListener(handlerobj);
		item3.addActionListener(handlerobj);
		password.addActionListener(handlerobj);	
		
		handlerclass1 handlerobj1 = new handlerclass1(); 
		item4.addKeyListener(handlerobj1);
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
	
	private class handlerclass1 implements KeyListener 
	{
		public void keyPressed(KeyEvent e)
		{
			//System.out.println("Key Pressed!!!");
			statusbar.setText("Key Pressed!!!");
			
			if(e.getKeyCode()==27) 
			{//check if the Keycode is 27 which is esc
				JOptionPane.showMessageDialog(null,"Good  Bye");//display a good bye messege
				System.exit(0);//exit
			}
		}
		
		public void keyReleased(KeyEvent e)
		{
			//System.out.println("Key Released!!!");
			statusbar.setText("Key Released!!!");
		}
		
		public void keyTyped(KeyEvent e)
		{
			//int getKeyChar()
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

