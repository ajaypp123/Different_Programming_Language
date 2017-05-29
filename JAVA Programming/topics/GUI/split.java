import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class tuna extends JFrame
{
	JPanel p1,p2;
	JTextArea t1,t2;
	JSplitPane span;
	
	public tuna()
	{
		super("menu demo");
		setLayout(new FlowLayout());
		
		setLayout(new BorderLayout());
		
		t1 = new JTextArea(100,100);
		t2 = new JTextArea(100,100);
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		
		
		span = new JSplitPane(JSplitPane.VERTICAL_SPLIT,p1,p2);
		p1.add(t1);
		p2.add(t2);
		add(span);

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
	