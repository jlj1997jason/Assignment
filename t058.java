
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
		System.out.println("副類別建構子執行中...");
		varX = 10;
	}
}

class CB extends CA{
	public CB() {
		System.out.println("子類別建構子執行中...");
	}
	public void show() {
		System.out.println("varX = " + varX);
	}
}