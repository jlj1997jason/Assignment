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
		System.out.println("�����Oshow1()���椤");  	}
	public void show2()
	{
		System.out.println("�����Oshow2()���椤");
	}
}
class CB extends CA	// �l���OCB�~�Ӧ����OCA
{
	protected int varB;
	@Override public void show1()
	{
		System.out.println("�l���O��g��show1()���椤");
	}
	public void show3()
	{
		System.out.println("�l���O�s�W��show3()���椤");
	}
}
