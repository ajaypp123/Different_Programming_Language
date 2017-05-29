// java

import javax.swing.*;
import java.awt.*;

class tuna extends JFrame
{
	private JLabel nm,add,sex,hobby,language,blank;
	private JButton ok,clear;
	private JTextField name;
	private JTextArea address;
	private JRadioButton m,f;
	private JCheckBox cri,bad, dance, music;
	private ButtonGroup bg;
	private JList list;
	private JScrollPane scr;
	private JPanel p1,p2,p3,p4,p5,main;
	
	private String[] lang = {"C","C++","Java","HTML","PHP","Python"}; 
	
	public tuna()
	{
		super("Demo Component");
		
		ok = new JButton("ok");
		clear = new JButton("clear");
		
		m = new JRadioButton("male",true);
		f = new JRadioButton("female");
		bg = new ButtonGroup();
		
		sex = new JLabel("	Sex: ");
		hobby = new JLabel("	Hobbbies: ");
		blank = new JLabel();
		
		cri = new JCheckBox("Cricket",true);
		bad = new JCheckBox("Badbinton");
		dance = new JCheckBox("Dance");
		music = new JCheckBox("Music");
		
		language = new JLabel("	Language known: ");
		list = new JList(lang);
		list.setVisibleRowCount(3);
		scr = new JScrollPane(list); 
		
		nm = new JLabel("Name:");
		add = new JLabel("Address:");
		name = new JTextField(20);
		
		address = new JTextArea(3,20);
		
		///////////////////////////
		
		p1 = new JPanel();
		p2 = new JPanel(new GridLayout(1,3));
		p3 = new JPanel();
		p4 = new JPanel(new GridLayout(1,2));
		p5 = new JPanel();
		main = new JPanel(new GridLayout(5,1));
		
		bg.add(m);
		bg.add(f);
		
		p1.add(nm);
		p1.add(name);
		p1.add(add);
		p1.add(address);
		p2.add(sex);
		p2.add(m);
		p2.add(f);
		p3.setLayout(new GridLayout(2,3));
		p3.add(hobby);
		p3.add(cri);
		p3.add(bad);
		p3.add(blank);
		p3.add(dance);
		p3.add(music);
		p4.add(language);
		p4.add(scr,BorderLayout.NORTH);
		p5.add(ok);
		p5.add(clear);
		
		main.add(p1);
		main.add(p2);
		main.add(p3);
		main.add(p4);
		main.add(p5);
		add(main);
		
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

