
public class ch10_11 {

	public static void main(String args[])
	{
		CMyClass X = new CMyClass();
		Class Y;  
		Y=X.getClass();
		System.out.println("X�ݩ�" + Y +"������");  
		String str = new String("..");  
		Y=str.getClass();  
		System.out.println("str�ݩ�" + Y +"������");


	}

}
class CMyClass
{
	private int var;
}
