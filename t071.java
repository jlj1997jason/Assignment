import java.io.FileWriter;
import java.io.IOException;

public class ch11_03 
{

	public static void main(String[] args) throws IOException
	{

		String str1 = "�O��ƦC�p�U:";
		char endCh[] = {'C','o','n','t','i','n','u','e','.','.','.'};
		int numF;
		FileWriter fw =
				new FileWriter("text2.txt");
		fw.write(str1);
		fw.write('\r');	fw.write('\n');
		for(int i=1;i<10;i++)
		{
			numF=Fib(i);  fw.write(numF+" ");
		}
		fw.write(endCh);  fw.close();	//����
	}
	public static int Fib(int n)
	{
		if((n==1) || (n==0))  return n;
		else
			return Fib(n-1)+Fib(n-2);
	}



}

