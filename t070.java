import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ch11_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		char cbuf[] = new char[256];	//try�᭱�i�H���W (�K�귽�K)
		try(FileReader fr =
				new FileReader("C:\\Users\\jason\\Desktop\\workplace\\ch10\\text1.txt"))
		{
			int num = fr.read(cbuf);
			String str1 = new String(cbuf,0,num);
			System.out.println("�`�@Ū��" + num + "�Ӧr����");  
			System.out.println(" �� �� �� �e �p �U ");  
			System.out.println(str1);
			fr.close();	//����
		}
		catch(FileNotFoundException e)
		{
			System.out.println("�ҥ~�o��:�䤣����ɮ�");
		}
		catch(final IOException e)
		{
			System.out.println("�ҥ~�o��:�ɮצs�����~");
		}
	}

}

