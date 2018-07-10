
public class ch10_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CShape obj =	new CShape();
		CRect obj1 = new CRect(5.0,15.0);
		CCircle obj2 = new CCircle(3.0);
		obj1.computeArea();  obj2.computeArea();
		System.out.print("�x��");  obj1.show();
		System.out.print("���");
		obj2.show();

	}

}
abstract class CShape	//�w�q��H���O
{
	protected double area;
	public void show()
	{
		System.out.println("area=" + area);
	}
	public abstract void computeArea(); //�ŧi��H��k �o�O�@�ө�H��k
}
class CRect extends CShape	// �l���OCRect�~�Ӧ����OCShape
{
	protected double length,width;
	public CRect(double i,double j)
	{
		length=i; width=j;
		}
	@Override public void computeArea()
	{
		area=length*width;
	}
}
class CCircle extends CShape
{
	protected double radius;  
	protected final double pi=3.14;
	public CCircle(double i) { radius=i; }
	@Override public void computeArea()
	{
		area=radius*radius*pi;
	}
}