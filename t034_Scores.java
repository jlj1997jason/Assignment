import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grades 
{

	static Scanner scanner = new Scanner(System.in);
	public static gradesDriver[] grades = new gradesDriver[50];
	static int studentID, Englishgrade, Mathgrade, temp = 1, count = 0;;

	public static void main(String[] args) 
	{
		while(true) 
		{
			if(temp == 1) 
			{
				System.out.print("Option: 1) Add. 2) Histogram. 3) Output. 4) Query. 5) Rank. -1) Quit:");
				int option = scanner.nextInt();
				if(option == 1) 
				{
					temp = 2;
				}
				else if(option == -1) 
				{
					System.out.println("End!");
					break;
				}
				else if(option == 2) 
				{
					temp = 3;
				}
				else if(option == 3) 
				{
					temp = 4;
				}
				else if(option == 4) 
				{
					temp = 5;
				}
				else if(option == 5) 
				{
					temp = 6;
				}
				else 
				{
					System.out.println("Error");
					temp = 1;
				}
			}
			else if(temp == 2) 
			{
				inputData();
				if(gradesDriver.searchRepeat(grades, studentID, count)==true) 
				{
					temp = 2;
					continue;
				}
				if(studentID == -1 && Englishgrade == -1 && Mathgrade == -1) 
				{
					temp = 1;
					continue;
				}
				if(studentID < 0 || Englishgrade < 0 || Mathgrade < 0 || Englishgrade > 100 || Mathgrade > 100) 
				{
					System.out.println("Error!");
					temp = 2;
					continue;
				}
				grades[count] = new gradesDriver(studentID, Englishgrade, Mathgrade, grades, count);
				count++;
			}
			else if(temp == 3) 
			{
				System.out.print("1) English. 2) Math. -1) Back: ");
				int Histogramoption = scanner.nextInt();
				if(Histogramoption == -1) 
					temp = 2;
				if(Histogramoption == 1) 
				{
					gradesDriver.showEnglish(grades, count);
				}
				if(Histogramoption == 2) 
				{
					gradesDriver.showMath(grades, count);
				}
				temp = 1;
			}
			else if(temp == 4) 
			{
				gradesDriver.output(grades, count);
				temp = 1;
			}
			else if(temp == 5) 
			{
				System.out.print("1) English. 2) Math. 3) Average. -1) Back:");
				int option = scanner.nextInt();
				if(option == 1) 
				{
					System.out.print("Start:");
					int S = scanner.nextInt();
					System.out.print("End:");
					int E = scanner.nextInt();
					gradesDriver.queryENG(grades, count, S, E);
					temp = 1;
				}
				else if(option == 2) 
				{
					System.out.print("Start:");
					int S = scanner.nextInt();
					System.out.print("End:");
					int E = scanner.nextInt();
					gradesDriver.queryMath(grades, count, S, E);
					temp = 1;
				}
				else if(option == 3) 
				{
					System.out.print("Start:");
					int S = scanner.nextInt();
					System.out.print("End:");
					int E = scanner.nextInt();
					gradesDriver.queryAverage(grades, count, S, E);
					temp = 1;
				}
				else if(option == -1)
				{
					temp = 1;
					continue;
				}
				else
				{
					System.out.print("Error!");
					temp = 5;
				}
			}
			else if(temp == 6) 
			{
				System.out.print("1) English. 2) Math. 3) Average. -1) Back: ");
				int option = scanner.nextInt();
				if(option == 1) 
				{
					System.out.print("Start:");
					int S = scanner.nextInt();
					System.out.print("End:");
					int E = scanner.nextInt();
					gradesDriver.printRankingEng(grades, count, S, E);
					temp = 1;
				}
				else if(option == 2) 
				{
					System.out.print("Start:");
					int S = scanner.nextInt();
					System.out.print("End:");
					int E = scanner.nextInt();
					gradesDriver.printRankingMath(grades, count, S, E);
					temp = 1;
				}
				else if(option == 3) 
				{
					System.out.print("Start:");
					int S = scanner.nextInt();
					System.out.print("End:");
					int E = scanner.nextInt();
					gradesDriver.printRankingavg(grades, count, S, E);
					temp = 1;
				}
				else if(option == -1) 
				{
					temp = 1;
					continue;
				}

				temp = 1;
			}
		}
	}

	public static void inputData() 
	{
		System.out.print("Insert new data (SN/ENGLISH/MATH):");
		studentID = scanner.nextInt();
		Englishgrade = scanner.nextInt();
		Mathgrade = scanner.nextInt();
	}
}
class gradesDriver
{
	private int SN, English, Math;
	private static int Rank = 1;
	private int tempRank;
	private int average;
	public gradesDriver(int studentID, int Englishgrade, int Mathgrade, gradesDriver[] b1, int m)
	{
		SN = studentID;
		English = Englishgrade;
		Math = Mathgrade;
		average = (Englishgrade + Mathgrade) / 2;
		tempRank = 1;
	}

	public static boolean searchRepeat(gradesDriver []b1, int SN, int m) 
	{
		for(int i = 0 ; i < m ; i++) 
		{

			if(b1[i].SN == SN) 
			{
				System.out.println("Data '"+SN+"' duplicated!");
				return true;
			}
		}
		return false;
	}
	public static void showEnglish(gradesDriver []b1, int m) 
	{
		int[] b2 = new int[11];
		for(int i = 0 ; i < m ; i++) 
		{
			b2[b1[i].English/10]++;
		}
		System.out.println("0	10	20	30	40	50	60	70	80	90	100");
		System.out.println("---------------------------------------------------------------------------------");
		int[] b3 = Arrays.copyOf(b2, b2.length);
		Arrays.sort(b3);
		for(int k = 0; k < b3[10] ; k++) 
		{
			for(int j = 0 ; j < 11 ; j++) 
			{
				if( b2[j] == 0) 
				{
					System.out.print(" \t");
					continue;
				}
				else {
					System.out.print("*\t");
					b2[j] --;
				}
			}
			System.out.println();
		}
	}
	public static void showMath(gradesDriver []b1, int m) 
	{
		int[] b2 = new int[11];
		for(int i = 0 ; i < m ; i++) 
		{
			b2[b1[i].Math/10]++;
		}
		System.out.println("0	10	20	30	40	50	60	70	80	90	100");
		System.out.println("-----------------------------------------------------------------------------");
		int[] b3 = Arrays.copyOf(b2, b2.length);
		Arrays.sort(b3);
		for(int k = 0; k < b3[10] ; k++) 
		{
			for(int j = 0 ; j < 11 ; j++) 
			{
				if( b2[j] == 0) 
				{
					System.out.print(" \t");
					continue;
				}
				else {
					System.out.print("*\t");
					b2[j] --;
				}
			}
			System.out.println();
		}
	}
	public static void output(gradesDriver[] b1,int m) 
	{

		System.out.println("SN\tENG.\tMATH.\tAVG.\tPASSED");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0 ; i < m ; i++) 
		{
			b1[i].average = (b1[i].English+b1[i].Math)/2;
			System.out.print(b1[i].SN+"\t"+b1[i].English+"\t"+b1[i].Math+"\t"+ b1[i].average + "\t" );
			if(b1[i].average >= 60) 
				System.out.print("y\n");
			else
				System.out.print("n\n");
		}
	}
	public static void queryENG(gradesDriver []b1, int m, int S, int E) 
	{
		int count = 0;
		int[] b2 = new int[50];
		for(int i = 0 ; i < m ; i++) 
		{
			if( S <= b1[i].English && E >= b1[i].English ) 
			{
				b2[count] = i;
				count++;
			}
		}
		System.out.println("SN\tENG.\tMATH.\tAVG.\tPASSED");
		System.out.println("----------------------------------------------------------------------");
		for(int j = 0 ; j < count ; j++ ) 
		{
			b1[j].average = (b1[b2[j]].English+b1[b2[j]].Math)/2;
			System.out.print(b1[b2[j]].SN+"\t"+b1[b2[j]].English+"\t" + b1[b2[j]].Math + "\t" + b1[b2[j]].average + "\t" );
			if( b1[j].average < 60 ) 
			{
				System.out.println("n");
			}
			else
				System.out.println("y");
		}	
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total:" + count+"\n");
	}
	public static void queryMath(gradesDriver []b1, int m, int S, int E) 
	{
		int count = 0;
		int[] b2 = new int[50];
		for(int i = 0 ; i < m ; i++) 
		{
			if( S <= b1[i].Math && E >= b1[i].Math ) 
			{
				b2[count] = i;
				count++;
			}
		}
		System.out.println("SN\tENG.\tMATH.\tAVG.\tPASSED");
		System.out.println("----------------------------------------------------------------------");
		for(int j = 0 ; j < count ; j++ ) 
		{
			b1[j].average = (b1[j].English+b1[j].Math)/2;
			System.out.print(b1[b2[j]].SN+"\t"+b1[b2[j]].English+"\t" + b1[b2[j]].Math + "\t" + b1[b2[j]].average + "\t" );
			if( b1[j].average < 60 ) 
			{
				System.out.println("n");
			}
			else
				System.out.println("y");
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total:" + count+"\n");
	}
	public static void queryAverage(gradesDriver []b1, int m, int S, int E) 
	{
		int count = 0;
		int[] b2 = new int[50];
		for(int i = 0 ; i < m ; i++) 
		{
			b1[i].average = (b1[i].English+b1[i].Math)/2;
			if( S <= b1[i].average && E >= b1[i].average ) 
			{
				b2[count] = i;
				count++;
			}
		}
		System.out.println("SN\tENG.\tMATH.\tAVG.\tPASSED");
		System.out.println("----------------------------------------------------------------------");
		for(int j = 0 ; j < count ; j++ ) 
		{
			b1[j].average = (b1[b2[j]].English+b1[b2[j]].Math)/2;
			System.out.print(b1[b2[j]].SN+"\t"+b1[b2[j]].English+"\t" + b1[b2[j]].Math + "\t" + b1[b2[j]].average + "\t" );
			if( b1[j].average < 60 ) 
			{
				System.out.println("n");
			}
			else
				System.out.println("y");
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total:" + count+"\n");
	}

	public static void printRankingEng(gradesDriver []b1, int m, int S, int E) 
	{ 
		// Copy original array 
		gradesDriver[] ary = new gradesDriver[m];
		gradesDriver[] ary2 = new gradesDriver[ary.length]; 
		int n = 0;
		for (int i = 0; i < ary.length; i++) 
		{ 
			if(S <= b1[i].English && b1[i].English <= E ) 
			{
				ary[n] = b1[i];
				ary2[n] = ary[n]; 
				n++;
			}
		} 

		// ranking 

		int[] avg = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			avg[i] = ary2[i].English;
		}
		Arrays.sort(avg);
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for (int x : avg) 
		{ 
			if (!al.contains(x))
				al.add(x); 
		} 

		// Print out 
		int size = al.size(); 
		int ary3[] = new int[n];
		int showAry[] = new int[n];
		int k = 0;
		for (int a = 0; a < n ; a++) 
		{ 
			int i = ary[a].English;
			ary3[k] = size - al.indexOf(i);
			k++;
		} 
		int j, s = 1;
		for(int i = 0 ; i < size ; i++) 
		{
			int count = 0;
			for(j = 0;j < ary3.length ; j++) 
			{
				if(ary3[j] == (i+1))
				{
					count++;
				}

			}
			if(i == 0) 
			{
				showAry[0] = i+1;
				s = s+count;
			}
			if(i > 0) 
			{
				showAry[i] = s;
				s += count;
			}
		}
		// Print
		System.out.println("SN\tENG.\tMATH.\tAVG.\tRank");
		System.out.println("----------------------------------------------------------------------");
		for (k = 0; k < n ; k++) { 
			int sum = showAry[ary3[k]-1];
			ary[k].average = (ary[k].English+ary[k].Math)/2;
			System.out.println(ary[k].SN+"\t"+ary[k].English+"\t"+ary[k].Math+"\t"+ary[k].average+"\t" + sum  );	
		}
		System.out.println("----------------------------------------------------------------------");
		double sum = 0;
		for(int a = 0 ; a < n ; a++)
		{
			sum += ary[a].average;
		}
		System.out.printf("Average:%.2f\n", sum/n);
		double std = 0;
		for(int a = 0 ; a < n ; a++)
		{
			std += ary[a].average * ary[a].average;
		}
		double STD =  java.lang.Math.sqrt(std/n - (sum/n * sum/n));
		System.out.printf("STD:%.2f\n", STD );
		System.out.printf("Median:%d\n", ary[n/2].average );
	}

	public static void printRankingMath(gradesDriver []b1, int m, int S, int E) 
	{ 
		// Copy original array 
		gradesDriver[] ary = new gradesDriver[m];
		gradesDriver[] ary2 = new gradesDriver[ary.length]; 
		int n = 0;
		for (int i = 0; i < ary.length; i++) 
		{ 
			if(S <= b1[i].Math && b1[i].Math <= E ) 
			{
				ary[n] = b1[i];
				ary2[n] = ary[n]; 
				n++;
			}
		} 

		// ranking 

		int[] avg = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			avg[i] = ary2[i].Math;
		}
		Arrays.sort(avg);
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for (int x : avg) 
		{ 
			if (!al.contains(x))
				al.add(x); 
		} 

		// Print out 
		int size = al.size(); 
		int ary3[] = new int[n];
		int showAry[] = new int[n];
		int k = 0;
		for (int a = 0; a < n ; a++) 
		{ 
			int i = ary[a].Math;
			ary3[k] = size - al.indexOf(i);
			k++;
		} 
		int j, s = 1;
		for(int i = 0 ; i < size ; i++) 
		{
			int count = 0;
			for(j = 0;j < ary3.length ; j++) 
			{
				if(ary3[j] == (i+1))
				{
					count++;
				}

			}
			if(i == 0) 
			{
				showAry[0] = i+1;
				s = s+count;
			}
			if(i > 0) 
			{
				showAry[i] = s;
				s += count;
			}
		}
		// Print
		System.out.println("SN\tENG.\tMATH.\tAVG.\tRank");
		System.out.println("----------------------------------------------------------------------");
		for (k = 0; k < n ; k++) { 
			int sum = showAry[ary3[k]-1];
			ary[k].average = (ary[k].English+ary[k].Math)/2;
			System.out.println(ary[k].SN+"\t"+ary[k].English+"\t"+ary[k].Math+"\t"+ary[k].average+"\t" + sum  );	
		}
		System.out.println("----------------------------------------------------------------------");
		double sum = 0;
		for(int a = 0 ; a < n ; a++)
		{
			sum += ary[a].Math;
		}
		System.out.printf("Average:%.2f\n", sum/n);
		double std = 0;
		for(int a = 0 ; a < n ; a++)
		{
			std += ary[a].Math * ary[a].Math;
		}
		double STD =  java.lang.Math.sqrt(std/n - (sum/n * sum/n));
		System.out.printf("STD:%.2f\n", STD );
		System.out.printf("Median:%d\n", ary[n/2].Math );
	}
	public static void printRankingavg(gradesDriver []b1, int m, int S, int E) 
	{ 
		// Copy original array 
		gradesDriver[] ary = new gradesDriver[m];
		gradesDriver[] ary2 = new gradesDriver[ary.length]; 
		int n = 0;
		for (int i = 0; i < ary.length; i++) 
		{ 
			if(S <= b1[i].average && b1[i].average <= E ) 
			{
				ary[n] = b1[i];
				ary2[n] = ary[n]; 
				n++;
			}
		} 

		// ranking 

		int[] avg = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			avg[i] = ary2[i].average;
		}
		Arrays.sort(avg);
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for (int x : avg) 
		{ 
			if (!al.contains(x))
				al.add(x); 
		} 

		// Print out 
		int size = al.size(); 
		int ary3[] = new int[n];
		int showAry[] = new int[n];
		int k = 0;
		for (int a = 0; a < n ; a++) 
		{ 
			int i = ary[a].average;
			ary3[k] = size - al.indexOf(i);
			k++;
		} 
		int j, s = 1;
		for(int i = 0 ; i < size ; i++) 
		{
			int count = 0;
			for(j = 0;j < ary3.length ; j++) 
			{
				if(ary3[j] == (i+1))
				{
					count++;
				}

			}
			if(i == 0) 
			{
				showAry[0] = i+1;
				s = s+count;
			}
			if(i > 0) 
			{
				showAry[i] = s;
				s += count;
			}
		}
		// Print
		System.out.println("SN\tENG.\tMATH.\tAVG.\tRank");
		System.out.println("----------------------------------------------------------------------");
		for (k = 0; k < n ; k++) { 
			int sum = showAry[ary3[k]-1];
			ary[k].average = (ary[k].English+ary[k].Math)/2;
			System.out.println(ary[k].SN+"\t"+ary[k].English+"\t"+ary[k].Math+"\t"+ary[k].average+"\t" + sum  );	
		}
		System.out.println("----------------------------------------------------------------------");
		double sum = 0;
		for(int a = 0 ; a < n ; a++)
		{
			sum += ary[a].average;
		}
		System.out.printf("Average:%.2f\n", sum/n);
		double std = 0;
		for(int a = 0 ; a < n ; a++)
		{
			std += ary[a].average * ary[a].average;
		}
		double STD =  java.lang.Math.sqrt(std/n - (sum/n * sum/n));
		System.out.printf("STD:%.2f\n", STD );
		System.out.printf("Median:%d\n", ary[n/2].average );
	}
}
