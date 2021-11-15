package d211005;
public class N24_ForMultiplicationTableExample
{
	public static void main(String[] args)
	{
		for (int m=2; m<=9; m++)	//int 타입의 m을 2부터 9까지 8번 반복.
		{
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++)	//m이 2일 때, n은 1부터 9까지 9번 반복.
			{
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}