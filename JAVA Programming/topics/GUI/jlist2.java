// java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class tuna extends JFrame
{
	private JList list;
	private JLabel picture;
	
	private static String[] filename = {"item1","item2","item3","item4","item2","item3","item4","item2","item3","item4","item2","item3","item4"};
	
	public tuna()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList(filename);
		list.setVisibleRowCount(4);
		list.setFixedCellWidth(200);
		list.setFixedCellHeight(15);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(list));
		
		picture = new JLabel("item list");
		add(picture);
	
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

