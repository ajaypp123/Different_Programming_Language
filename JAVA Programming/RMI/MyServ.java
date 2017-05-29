import java.rmi.*;
import java.util.*;
import java.rmi.server.*;

class Client
{
	String cname,mess;
	boolean Updated=false;
}
public class MyServ extends UnicastRemoteObject implements Myif
{
	Vector<Client> list;
	public MyServ() throws RemoteException
	{
		super();
		list=new Vector();
	}
	public void login(String s) throws RemoteException
	{
		Client c=new Client();
		c.cname=s;
		list.add(c);
		String updated="$";
		for(Client c1:list)
		{
			updated=updated+"#"+c1.cname;
							
		}
		for(Client c2:list)
		{
			
				c2.Updated=true;
				c2.mess=updated;
			
		}
	}
	public Vector getList() throws RemoteException
	{
		return list;
	}
	public void sendMess(String mess) throws RemoteException
	{
		StringTokenizer st=new StringTokenizer(mess,"#");
		String from=st.nextToken();
		String to=st.nextToken();

		for(Client c:list)
		{
			if(c.cname.equals(to) )
			{
				c.Updated=true;
				c.mess=mess;
			}
		}
	}
	public String recvMess(String s) throws RemoteException
	{
		for(Client c:list)
		{
			if(c.cname.equals(s) && c.Updated)
			{
				c.Updated=false;
				return c.mess;
			}
		}
		return null;
	}

	public static void main(String a[])
	{
		try
		{
			MyServ serv=new MyServ();
			Naming.rebind("MyServ",serv);
		}catch(Exception e){}
	}
}