
public class ch10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB objB = new CB();
		objB.show();
	}

}
class CA{
	protected int varX;
	public CA() {
		System.out.println("�����O�غc�l���椤...");
		varX = 10;
	}
}

class CB extends CA{
	public CB() {
		System.out.println("�l���O�غc�l���椤...");
	}
	public void show() {
		System.out.println("varX = " + varX);
	}
}