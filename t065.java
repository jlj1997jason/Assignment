
public class ch10_11 {

	public static void main(String args[])
	{
		CMyClass X = new CMyClass();
		Class Y;  
		Y=X.getClass();
		System.out.println("X屬於" + Y +"的物件");  
		String str = new String("..");  
		Y=str.getClass();  
		System.out.println("str屬於" + Y +"的物件");


	}

}
class CMyClass
{
	private int var;
}
