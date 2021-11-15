package d211005;
public class N35_Exercise06
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)				//1부터 5까지 5번 반복.
		{
			for(int j=1; j<=i; j++)			//j는 1부터, i보다 작거나 같다.
											//i=1일 때, j=1
											//i=2일 때, j=1,2
											//i=3일 때, j=1,2,3
											//i=4일 때, j=1,2,3,4
											//i=5일 때, j=1,2,3,4,5
			{
				System.out.print("*");		//"*"을 출력.
				if(j==i)					//j 변수와 i 변수가 같으면,
				{
					System.out.println();	//줄바꿈.
				}
			}
		}
	}
}