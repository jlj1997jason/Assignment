
public class ch10_04 {

	public static void main(String[] args) {
		
		CB objB = new CB();
				objB.show();
				objB.show(10);
				objB.show(10.0);
	}

}
class CA{
	public void show() {
		System.out.println("�ثe��������O��show()");
	}
}
class CB extends CA{
	@Override public void show() {
		System.out.println("�ثe����l���O��show()");
	}
	public void show(int x) {
		System.out.println("�ثe����l���O��show("+x+")");
	}
	public void show(double x)
	{
	System.out.println("�ثe����l���O��show(double)");  
	super.show();
	}

}
