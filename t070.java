import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ch11_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		char cbuf[] = new char[256];	//try後面可以接上 (…資源…)
		try(FileReader fr =
				new FileReader("C:\\Users\\jason\\Desktop\\workplace\\ch10\\text1.txt"))
		{
			int num = fr.read(cbuf);
			String str1 = new String(cbuf,0,num);
			System.out.println("總共讀取" + num + "個字元數");  
			System.out.println(" 檔 案 內 容 如 下 ");  
			System.out.println(str1);
			fr.close();	//關檔
		}
		catch(FileNotFoundException e)
		{
			System.out.println("例外發生:找不到該檔案");
		}
		catch(final IOException e)
		{
			System.out.println("例外發生:檔案存取錯誤");
		}
	}

}

