
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
		System.out.println("�����O�L�Ѽƫغc�l���椤...");
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
		
		System.out.println("�l���OvarX = " + varX);
		System.out.println("�����OvarX = " + super.varX);
	}
}
