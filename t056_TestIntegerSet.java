import java.util.Arrays;
import java.util.Scanner;

public class TestIntegerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IntegerSet objA = new IntegerSet();
		IntegerSet objB = new IntegerSet();
		int optionMenu, temp = 1, count = 0;
		while(true){
			if(temp == 1) {
				System.out.print("Initial size for Set A:");
				int sizeA = scan.nextInt();
				System.out.print("Initial size for Set B:");
				int sizeB = scan.nextInt();
				objA = new IntegerSet(sizeA);
				objB = new IntegerSet(sizeB);
				temp = 2;
			}
			else if(temp == 2) {
				System.out.print("Menu: 1) Modify A. 2) Modify B. 3) Intersection. 4) Union. -1) Quit:");
				optionMenu = scan.nextInt();
				if(optionMenu == -1) {
					System.out.println("End!");
					break;
				}
				if(optionMenu == 1) {
					char optionModify;
					do {
						System.out.print("Modify A: a) Insert. b) Output. c) Delete. d) Back:");
						optionModify = scan.next().charAt(0);

						if(optionModify == 'd') {
							temp = 2;
							break;
						}
						if(optionModify == 'a') {
							System.out.print("Insert:");
							int value = scan.nextInt();

							if(value < 0 || value > 100) {
								System.out.println("'" + value +"' out of range!");
								continue;
							}
							if(objA.search(value) != -1) {
								System.out.println("'" + value + "' duplicated!");
								continue;
							}
							if(objA.search(value) == -1) {
								objA.Insert(value);
								count++;
								System.out.println("'" + value +"' successfully inserted!");
								continue;
							}
						}
						if(optionModify == 'b') {
							objA.output();
						}
						if(optionModify == 'c') {
							System.out.print("Delete:");
							int d2 = scan.nextInt();
							objA.delete(d2);
						}
					}while(optionModify != 'd');
				}
				if(optionMenu == 2) {
					char optionModify;
					do {
						System.out.print("Modify B: a) Insert. b) Output. c) Delete. d) Back:");
						optionModify = scan.next().charAt(0);
						if(optionModify == 'd') {
							temp = 2;
							break;
						}
						if(optionModify == 'a') {
							System.out.print("Insert:");
							int value = scan.nextInt();
							if(value < 0 || value > 100) {
								System.out.println("'" + value +"' out of range!");
								continue;
							}
							if(objB.search(value) != -1) {
								System.out.println("'" + value + "' duplicated!");
								continue;
							}
							if(objB.search(value) == -1) {
								objB.Insert(value);
								count++;
								System.out.println("'" + value +"' successfully inserted!");
								continue;
							}
						}
						if(optionModify == 'b') {
							objB.output();
						}
						if(optionModify == 'c') {
							System.out.print("Delete:");
							int d2 = scan.nextInt();
							objB.delete(d2);
						}
					}while(optionModify != 'd');
				}
				if(optionMenu == 3) {
					System.out.print("Intersection:");
					objB.intersection(objA).output();
				}
				if(optionMenu == 4) {
					System.out.print("Union: ");
					objB.union(objA).output();
				}
			}
		}

	}
}
class IntegerSet {
	private int[] element;	 //儲存數字的陣列；最小長度為10
	private int count;		//目前陣列內的數字個數

	public IntegerSet () {
		this(10);
	}			//建構子
	public IntegerSet (int size) {
		if(size > 10)
			element = new int[size];
		else
			element = new int[10];
		count = 0;
	}		//建構子；引數代表集合可儲存最大容量
	public void Insert(int value) {
		if(this.search(value) != -1 || value < 0 || value > 100)
			return;
		if(this.count >= element.length)
			this.resize(element.length * 2); //呼叫resize將陣列變大
		element[count ++] = value;
	}	//新增新的元素value（重複的元素不加入）
	public int getElement(int i) {
		if(i < 0 || i > count)
			return -1;
		return element[i];

	}	//抓取編號為i的整數，如果索引超出範圍，請回傳-1
	public void output() {
		for(int i = 0 ; i < count ; i++) {
			System.out.print(element[i]);
			if(i != count - 1) 
				System.out.print(",");
			if(i == count - 1)
				System.out.println();
		}
	}			//印出集合中所有元素的內容
	public int search(int value) {
		for(int i = 0; i < count; i++) {
			if(value == element[i]) 
				return i;
		}
		return -1;
	}//搜尋value是否在集合中。有則回傳其index，否則回傳-1
	public void delete(int value) {
		if(this.search(value) == -1) {
			System.out.println("'" + value + "' not found!");
		}
		else {
			for(int i = this.search(value) ; i < count - this.search(value) - 1 ; i++)
				element[i] = element[i+1];
			System.out.println("'" + value + "' successfully deleted!");
			count--;
		}
	}  //移除元素value
	public IntegerSet intersection(IntegerSet A) {
		int countemp = 0;
		if(A.count <= this.count)
			countemp = A.count;
		else
			countemp = this.count;
		IntegerSet C = new IntegerSet();
		for(int j = 0 ; j < countemp ; j ++) {
			if( this.search(A.element[j]) != -1) {
				C.Insert(A.element[j]);
			}
		}
		return C;
	}	//求出與A的交集並予以回傳
	public IntegerSet union(IntegerSet A) {
		IntegerSet c = new IntegerSet();
		for(int j = 0; j < this.count ; j++)
			c.Insert(this.element[j]);
		for(int j = 0; j < A.count ; j++)
			c.Insert(A.element[j]);
		return c;
	}		//求出與A的聯集並予以回傳
	private void resize(int newSize) {
		int newArray[] = new int[newSize];
		for (int i = 0; i < this.count; i++) {
			newArray[i] = this.element[i];
		}
		this.element = null;
		this.element = newArray;

	}  //數字數量大於陣列長度時變更陣列大小

}
