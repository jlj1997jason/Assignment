
public class ch10_09 {

	public static void main(String args[])
	{
		CMyClass X = new CMyClass(5);
		CMyClass Y = new CMyClass(5);
		CMyClass Z = X;
		System.out.print("物件X與物件Y	");  
		if(X.equals(Y))
			System.out.println("兩物件相等");  
		else
			System.out.println("兩物件不相等");
		System.out.print("物件X與物件Z	");
		if(X.equals(Z))
			System.out.println("兩物件相等");  
		else
			System.out.println("兩物件不相等");




	}

}
class CMyClass
{
	private int Var;  
	public CMyClass(){}  
	public CMyClass(int i)
	{
		Var=i;
	}
}

