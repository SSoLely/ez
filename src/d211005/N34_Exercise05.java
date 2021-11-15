package d211005;
public class N34_Exercise05
{
	public static void main(String[] args)
	{
		for(int x=1; x<=10; x++)									//x는 1부터 10까지 10번 반복.
		{
			for(int y=1; y<=10; y++)								//y는 1부터 10까지 10번 반복.
			{
				if( (4*x + 5*y) == 60)								//4*x + 5*y가 60이 나오면,	
				{
					System.out.println("(" + x + ", " + y + ")");	//출력.
				}
			}
		}
	}
}