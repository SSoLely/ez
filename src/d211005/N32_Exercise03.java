package d211005;
public class N32_Exercise03
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=1; i<=100; i++)	//i는 1부터 100까지 1식 증가하면서 반복.
		{
			if(i%3 == 0)			//조건문: i를 3으로 나눈 나머지가 0인 것만 sum 변수에 저장.
			{
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}