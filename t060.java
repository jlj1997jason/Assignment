
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
		System.out.println("目前執行父類別的show()");
	}
}
class CB extends CA{
	@Override public void show() {
		System.out.println("目前執行子類別的show()");
	}
	public void show(int x) {
		System.out.println("目前執行子類別的show("+x+")");
	}
	public void show(double x)
	{
	System.out.println("目前執行子類別的show(double)");  
	super.show();
	}

}
