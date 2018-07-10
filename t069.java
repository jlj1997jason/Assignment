import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ch11 {

	public static void main(String[] args) 
	// TODO Auto-generated method stub
			throws IOException,FileNotFoundException
	{
		char cbuf[] = new char[16];
		FileReader fr =
				new FileReader("text1.txt.");  
		int num;
		String str1;

		while((num = fr.read(cbuf)) !=-1)
		{

			str1 = new String(cbuf,0,num);
			System.out.println("總共讀取" + num + "字元數"); 
			System.out.println(str1);
			System.out.println("-----------------------");
		}
		fr.close();	//關檔
	}
}

