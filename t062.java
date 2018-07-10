package ch10;

public class ch8_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CA  obj =	new CB();
		obj.show1();
		obj.show2();
		//obj.show3();

	}

}
class CA
{
	protected int varA;
	public void show1()
	{
		System.out.println("父類別show1()執行中");  	}
	public void show2()
	{
		System.out.println("父類別show2()執行中");
	}
}
class CB extends CA	// 子類別CB繼承自類別CA
{
	protected int varB;
	@Override public void show1()
	{
		System.out.println("子類別改寫的show1()執行中");
	}
	public void show3()
	{
		System.out.println("子類別新增的show3()執行中");
	}
}
