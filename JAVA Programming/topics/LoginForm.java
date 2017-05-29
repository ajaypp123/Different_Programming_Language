import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginFormClass extends JFrame
{
	String gender;
	JScrollBar p1;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JPasswordField pass1;
	JPasswordField pass2;
	JTextField field4;
	JTextField field5;
	JTextField field6;
	JTextField field7;
	JButton submit;
	JButton cancel;
	JCheckBox box;
	JRadioButton rb1;
	JRadioButton rb2;
	ButtonGroup bg;
	JList list;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JLabel label8;
	JLabel label9;
	JScrollPane jsp;
	JComboBox jbox;
	JMenuBar jmb= new JMenuBar();
	JMenu jmz,jma,jmc;
	JMenuItem jm1,jm2,jm3,jm4,jm5,jm6,jm7;
	JTextArea a1;
	LoginFormClass()
	{
		super("LoginForm");
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jma = new JMenu("File");
		jm1 = new JMenuItem("new");
		jm2 = new JMenuItem("open");
		jm3 = new JMenuItem("exit");
		jma.add(jm1);
		jma.add(jm2);
		jma.add(jm3);
		jmb.add(jma);
		jmz = new JMenu("View");
		jm4 = new JMenuItem("font");
		jm5 = new JMenuItem("zoom");
		jmz.add(jm4);
		jmz.add(jm5);
		jmb.add(jmz);
		jmc = new JMenu("Setting");
		jm6 = new JMenuItem("about");
		jm7 = new JMenuItem("Liecence");
		jmc.add(jm6);
		jmc.add(jm7);
		jmb.add(jmc);
		jmb.setBounds(0,0,500,25);
		add(jmb);
		
		
		label1 = new JLabel("FirstName");
		label1.setBounds(30,30,60,25);
		add(label1);
		field1 = new JTextField(20);
		field1.setBounds(100,30,200,25);
		add(field1);
		
		label2 = new JLabel("MiddleName");
		label2.setBounds(30,60,80,25);
		add(label2);
		field2 = new JTextField(20);
		field2.setBounds(100,60,200,25);
		add(field2);
		
		label3 = new JLabel("LastName");
		label3.setBounds(30,90,60,25);
		add(label3);
		field3 = new JTextField(20);
		field3.setBounds(100,90,200,25);
		add(field3);

		label4 = new JLabel("Gender");
		label4.setBounds(30,120,100,25);
		add(label4);
		
		rb1= new JRadioButton("Male");
		rb1.setBounds(100,120,60,20);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(160,120,80,20);
		add(rb1);
		add(rb2);
		bg = new ButtonGroup();
		//bg.setBounds()
		bg.add(rb1);
		bg.add(rb2);
		
		label5 = new JLabel("Education");
		label5.setBounds(30,150,60,20);
		add(label5);
		
		/*String[] cources = {"CSE","ELE","ENTC","MECH","AUTO","IT"};
		list = new JList(cources);
		list.setVisibleRowCount(3);
		jsp = new JScrollPane(list);
		jsp.setBounds(100,150,60,60);
		add(jsp);*/
		jbox = new JComboBox();
		jbox.addItem("Computer Science");
		jbox.addItem("Electrical Engg");
		jbox.addItem("Electronics Engg");
		jbox.addItem("Mechanical Engg");
		jbox.addItem("Automobile Engg");
		jbox.addItem("Civil Engg");
		jbox.addItem("Information Tech");
		jbox.setBounds(100,150,200,25);
		add(jbox);
		
		
		label6 = new JLabel("Email_ID");
		label6.setBounds(30,180,60,20);
		add(label6);
		field4 = new JTextField(20);
		field4.setBounds(100,180,200,25);
		add(field4);
		
		label7 = new JLabel("Password");
		label7.setBounds(30,220,60,20);
		add(label7);
		field5 = new JPasswordField(20);
		field5.setBounds(100,220,200,25);
		add(field5);
		
		label8 = new JLabel("Reenter");
		label8.setBounds(30,250,100,20);
		add(label8);
		field6 = new JPasswordField(20);
		field6.setBounds(100,250,200,25);
		add(field6);
		
		label9 = new JLabel("Mobile_No");
		label9.setBounds(30,280,150,20);
		add(label9);
		field7 = new JTextField(20);
		field7.setBounds(100,280,200,25);
		add(field7);
		
		box = new JCheckBox("Accept terms and conditions");
		box.setBounds(30,310,250,20);
		add(box);
		
		handler hand = new handler();
		
		submit = new JButton("SUBMIT");
		submit.setBounds(30,340,80,30);
		submit.addActionListener(hand);
		add(submit);

		cancel = new JButton("CANCEL");
		cancel.setBounds(120,340,90,30);
		add(cancel);
		
		a1=new JTextArea();
		a1.setBounds(30,380,150,150);
		add(a1);

		p1=new JScrollBar(JScrollBar.HORIZONTAL);
		a1.add(p1);

		rb1.addActionListener(hand);
		rb2.addActionListener(hand);
		jm2.addActionListener(hand);
	}
	class handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(rb1.isSelected())
			{
			gender="Male";
			}
			if(rb2.isSelected())
			{
			gender="Female";
			}
			
			if(e.getSource()==submit)
			{
				
				a1.setText("First Name:: "+ field1.getText() + "\nMiddle Name::"+ field2.getText()+ "\nLast Name::"+field3.getText()+"\nGender::"+ gender+"\n"+"Education:: "+jbox.getSelectedItem());
			}
			if(jm2.isArmed())
			{
				System.out.println("ZAVZADZ");
			}
		}
	}
}

public class LoginForm
{
	public static void main(String arg[])
	{
		LoginFormClass obj = new LoginFormClass();
	}
}
