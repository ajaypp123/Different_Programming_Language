import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class gui extends JFrame
{
	private JButton reg;
	private JButton custom;
	
	public gui()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		reg = new JButton("regular");
		add(reg);
		 
		//Icon b = new ImageIcon(getClass().getRsource("G:\bu1.png"));
		//Icon x = new ImageIcon(getClass().getRsource("G:\bu2.png"));
		//custom = new JButton("Custom",b);
		//custom.setRolloverIcon(x);
		//add(custom);
		
		handlerclass obj = new handlerclass();
		reg.addActionListener(obj);
		//custom.addActionListener(obj);
		
	}

	private class handlerclass implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, String.format("%s", e.getActionCommand())); 
		}
	}
}

class myclass
{
	public static void main(String []args)
	{
		gui obj = new gui();
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350,200);
		obj.setVisible(true);
	}
}