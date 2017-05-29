import javax.swing.JOptionPane;

class apples
{
	public static void main(String s[])
	{
		String fn = JOptionPane.showInputDialog("Enter first number : ");
		String sn = JOptionPane.showInputDialog("Enter second number : ");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int num3 = num1 + num2;
		
		int re = JOptionPane.showConfirmDialog(null,"Select ok to save","title",JOptionPane.YES_NO_OPTION);
		
		if(re == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "The sum of two num is : " +num3, "Title:sum application", JOptionPane.PLAIN_MESSAGE) ;
	
		}
		
		//JOptionPane.showMessageDialog(null, "The sum of two num is : " +num3, "Title:sum application", JOptionPane.PLAIN_MESSAGE) ;
		
	}
}