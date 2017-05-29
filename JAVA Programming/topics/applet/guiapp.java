
import java.applet.*;
import javax.swing.*;
import java.awt.*;
/*
<applet code="guiapp" width=600 height=250>
</applet>*/

public class guiapp extends JApplet
{
	public void init()
	{
	 guiapp obj = new guiapp();

	}
	
	public guiapp()
	{
		JLabel nm,add,sex,hobby,language,blank;
	 JButton ok,clear;
	 JTextField name;
	 JTextArea address;
	 JRadioButton m,f;
	 JCheckBox cri,bad, dance, music;
	 ButtonGroup bg;
	 JList list;
 JScrollPane scr;
	 JPanel p1,p2,p3,p4,p5,main;
	
	 String[] lang = {"C","C++","Java","HTML","PHP","Python"}; 
		
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



