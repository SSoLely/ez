package d211005;
public class N22_ForSumFrom1To100Example
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		int i = 0;
		for(i = 1; i<=100; i++)	//i는 1부터 100까지 1씩 증가시키면서 반복.
		{
			sum += i;			//sum=sum+i //i가 1일 때, sum=0+1=1 //i가 2일 때, sum=1+2=3 /i가 3일 때, sum=3+3=6 //이런 식으로 100번 반복.
		}						//100번 반복하면, 결국은 1부터 100까지의 합이 된다.
		System.out.println("1부터 " + (i-1) + "까지의 합: " + sum);	//여기서 i는 101이기 때문에 1을 빼주는 것이다.
	}
}