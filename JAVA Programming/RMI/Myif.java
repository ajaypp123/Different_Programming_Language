import java.rmi.*;
import java.util.*;

public interface Myif extends Remote
{
	public void login(String s) throws RemoteException;
	public List getList() throws RemoteException;
	public void sendMess(String mess) throws RemoteException;
	public String recvMess(String s) throws RemoteException;
}