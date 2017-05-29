import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class tuna extends JFrame
{
	private JLabel item1;
	
	public tuna()
	{
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel(" This is sentences ");
		item1.setToolTipText("This gona show comment");
		
		add(item1);
	}
}

class apples
{
	public static void main(String args[])
	{
		tuna t = new tuna();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setSize(275,180);
		t.setVisible(true);
	}
}