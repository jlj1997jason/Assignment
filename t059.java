
public class ch10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB objB = new CB(10);
		objB.show();
	}

}
class CA{
	public int varX;
	public CA() {
		System.out.println("父類別無參數建構子執行中...");
	}
	public CA(int i ) {
		varX = i;
	}
}
class CB extends CA{
	public int varX;
	public CB() {}
	public CB(int i) {
		super(i);
		varX = 100;
	}
	public void show() {
		super.varX++;
		
		System.out.println("子類別varX = " + varX);
		System.out.println("父類別varX = " + super.varX);
	}
}
