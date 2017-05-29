
import static com.mtsystems.coot.String8.s8;
import com.mtsystems.coot.NativeHelper;
import com.mtsystems.coot.String8;
import java.util.Scanner;

import java.io.RandomAccessFile;

class compiler 
{
	public static void main(String[] args) 
	{
		public static int i = 0, id = 0, kw = 0, num = 0, op = 0, sp = 0, dd = 0;

		public static int x = 0, l = 0, flag99 = 0, flag98 = 0, z = 0, y = 0, flag97 = 0, flag95 = 0;

		public static int kee3 = 0, idd3 = 0, opp3 = 0, see3 = 0, num3 = 0;

		public static int[][] kee = new int[30][30], idd = new int[30][30], kee2 = new int[30][30], idd2 = new int[30][30], num2 = new int[30][30];
		public static byte[] opp = new byte[30], opp2 = new byte[15], see = new byte[15], see2 = new byte[15];
		public static RandomAccessFile file;
		public static String8 keys = String8.fromPartialData(32, 10, new byte[][] {"auto".getBytes(), "break".getBytes(), "case".getBytes(), "char".getBytes(), "const".getBytes(), "continue".getBytes(), "default".getBytes(), "do".getBytes(), "double".getBytes(), "else".getBytes(), "enum".getBytes(), "printf".getBytes(), "float".getBytes(), "for".getBytes(), "goto".getBytes(), "if".getBytes(), "int".getBytes(), "long".getBytes(), "register".getBytes(), "return".getBytes(), "short".getBytes(), "signed".getBytes(), "sizeof".getBytes(), "static".getBytes(), "struct".getBytes(), "switch".getBytes(), "typedef".getBytes(), "union".getBytes(), "unsigned".getBytes(), "void".getBytes(), "volatile".getBytes(), "while".getBytes()});
	
		public static byte ch;
		public static byte[] str = new byte[25], sep = " ,;(){}[]:\" \0".getBytes(), oper = "!%^&*-+=~|.<>/?\0".getBytes();
		public static String8 seps = s8(16, " \t\n,;(){}[]:\"<>");
		public static int j;
		public static byte[] fname = new byte[50];
		public static RandomAccessFile f1;
		
		Scanner STDIN_SCANNER = new Scanner(System.in);
		System.out.println("enter file path ");
		fname.copyFrom(STDIN_SCANNER.next());
	
	}
}

