
public class ch10_09 {

	public static void main(String args[])
	{
		CMyClass X = new CMyClass(5);
		CMyClass Y = new CMyClass(5);
		CMyClass Z = X;
		System.out.print("����X�P����Y	");  
		if(X.equals(Y))
			System.out.println("�⪫��۵�");  
		else
			System.out.println("�⪫�󤣬۵�");
		System.out.print("����X�P����Z	");
		if(X.equals(Z))
			System.out.println("�⪫��۵�");  
		else
			System.out.println("�⪫�󤣬۵�");




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

