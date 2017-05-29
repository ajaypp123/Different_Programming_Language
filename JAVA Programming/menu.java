
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class tuna extends JFrame
{
	private JLabel nm,add,sex,hobby,language,blank;
	private JButton ok,clear;
	private JTextField name;
	private JTextArea address,ta;
	private JRadioButton m,f;
	private JCheckBox cri,bad, dance, music;
	private ButtonGroup bg;
	private JList list;
	private JScrollPane scr;
	private JPanel p1,p2,p3,p4,p5,tp,pt1,pt2;
	private JTabbedPane tpan;
	//JFileChooser j;
	
	private JMenu m1,m2,m3;
	private JMenuBar mb;
	private JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
	
	private String[] lang = {"C","C++","Java","HTML","PHP","Python"}; 
	
	public tuna()
	{
		super("menu demo");
		setLayout(new FlowLayout());
		
		setLayout(new BorderLayout());
		
		mb = new JMenuBar();
		setJMenuBar(mb); 
		
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		m3 = new JMenu("Search");
		
		i1 = new JMenuItem("New");
		i2 = new JMenuItem("Open");
		i3 = new JMenuItem("Save");
		i4 = new JMenuItem("Close");
		i5 = new JMenuItem("Exit");
		i6 = new JMenuItem("Undo");
		i7 = new JMenuItem("Redo");
		i8 = new JMenuItem("Copy");
		i9 = new JMenuItem("Cut");
		i10 = new JMenuItem("Paste");
		i11 = new JMenuItem("Find");
		i12 = new JMenuItem("Replace");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		m2.add(i6);
		m2.add(i7);
		m2.add(i8);
		m2.add(i9);
		m2.add(i10);
		m2.add(m3);
		m3.add(i11);
		m3.add(i12);
		
		mb.add(m1);
		mb.add(m2);
		mb.setBounds(0,0,500,25);
		//add(mb,BorderLayout.NORTH);
		
		ok = new JButton("ok");
		clear = new JButton("clear");
		
		m = new JRadioButton("male",true);
		f = new JRadioButton("female");
		bg = new ButtonGroup();
		
		sex = new JLabel("Sex: ");
		hobby = new JLabel("Hobbbies: ");
		blank = new JLabel();
		
		cri = new JCheckBox("Cricket",true);
		bad = new JCheckBox("Badbinton");
		dance = new JCheckBox("Dance");
		music = new JCheckBox("Music");
		
		language = new JLabel("Language known: ");
		list = new JList(lang);
		list.setVisibleRowCount(3);
		scr = new JScrollPane(list); 
		
		nm = new JLabel("Name:");
		add = new JLabel("Address:");
		
		name = new JTextField(10);
		
		address = new JTextArea(5,10);
		ta = new JTextArea(100,100);
		
		tpan = new JTabbedPane();
		add(tpan,BorderLayout.CENTER);
		
		p1 = new JPanel(new GridLayout(2,2,12,12));
		p2 = new JPanel(new GridLayout(1,3));
		p3 = new JPanel();
		p4 = new JPanel(new GridLayout(1,2));
		p5 = new JPanel();
		tp = new JPanel();
		pt1 = new JPanel(new GridLayout(4,1));
		pt2 = new JPanel();
		
		
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
		tp.add(ta);
		
		pt1.add(p1);
		pt1.add(p2);
		pt1.add(p3);
		pt1.add(p4);
		pt2.add(p5);
		
		tpan.addTab("Form",pt1);
		tpan.addTab("Text",tp);
		tpan.addTab("select",pt2);
		
		/*void open()
		{
				j = new JFileChooser();
				int k = j.showOpenDialog();
				if(k==JFileChooser.APPROVE_OPTION)
				{
					File f = j.getSelectedFile();
					String fname = f.getPath();
					
					OpenFrame ob = new OpenFrame(fname);
					ob.setSize(500,500);
					ob.setVisible(true);
				}
			
			}*/
		
	
		handlerclass handlerobj = new handlerclass(); 
		
		ok.addActionListener(handlerobj);
		m.addActionListener(handlerobj);
		f.addActionListener(handlerobj);
		cri.addActionListener(handlerobj);
		bad.addActionListener(handlerobj);
		dance.addActionListener(handlerobj);
		music.addActionListener(handlerobj);
		//i2.addActionListener(handlerobj);
		
		list.addListSelectionListener(handlerobj);
			
	}
	
	class handlerclass implements ActionListener,ListSelectionListener
	{
		String s = "";
		
		String s3 = "";
		public void valueChanged(ListSelectionEvent se)
		{
			int i = list.getSelectedIndex();
			
			if(i == 0)
			{
				s3 = "	C ";
			}
			if(i == 1)
			{
				s3 = "	C++ ";
			}
			if(i == 2)
			{
				s3 = "	Java ";
			}
			if(i == 3)
			{
				s3 = "	HTML ";
			}
			if(i == 4)
			{
				s3 = "	PHP ";
			}
			if(i == 5)
			{
				s3 = "	Phython ";
			}
		}	
		
		public void actionPerformed(ActionEvent e)
		{
			String s1 = "";
		
			String s2 = "";
			if(m.isSelected())
			{
				s2 = "Sex: male ";
			}

			if(f.isSelected())
			{
				s2 = "Sex: female ";
			}
			
			String s4 = "";
			if(cri.isSelected())
			{
				s4 = "Cricket ";
			}
			
			String s5 = "";
			if(bad.isSelected())
			{
				s5 = "	Batbinton ";
			}
			
			String s6 = "";
			if(dance.isSelected())
			{
				s6 = "	Dance ";
			}
			
			String s7 = "";
			if(music.isSelected())
			{
				s7 = "	Music ";
			}
			
			/*if(i2.isArmed())
			{
				this.open();
			}*/
			
			
			if(e.getSource()==ok)
			{
				s1 = "Name: "+name.getText()+"\nAddress: "+address.getText();
				s = s1 + "\n" + s2 +"\nHobbies: "+ s4 +s5 +s6 +s7 +"\nLanguage known: "+ s3;
				
				JOptionPane.showMessageDialog(null,s);
				
				ta.setText(s);
				
			try{
				byte b[] = s.getBytes();
				
				FileOutputStream fi = new FileOutputStream("a.txt");
				
				int i;
				
				for(i=0;i<b.length;i++)
				{
					fi.write(b[i]);
				}
				
				fi.close();
			}catch(Exception ex){}	
			
			try{
				FileInputStream fi = new FileInputStream("a.txt");
				FileOutputStream fi1 = new FileOutputStream("b.txt");
				
				int j;
				
				while((j=fi.read()) != -1)
				{
					System.out.println((char)j);
					fi1.write((char)j);
					
				}
				
				fi.close();
			}catch(Exception ex){}
			
				
			/*try{	
				FileWriter fi = new FileWriter("a.txt");
				fi.write(s);
				fi.close();
			}catch(Exception ex){}*/
			
			}

		}
		
		
	}
	
}

class myclass
{
		
	public static void main(String []args)
	{
		tuna obj = new tuna();
		
		obj.setDefaultCloseOperation(/*JFrame.EXIT_ON_CLOSE*/3);
		obj.setSize(300,350);
		obj.setVisible(true);
	}
}
