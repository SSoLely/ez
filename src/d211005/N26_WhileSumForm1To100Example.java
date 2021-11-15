package d211005;
public class N26_WhileSumForm1To100Example
{
	public static void main(String[] args)
	{
		int sum = 0;	//합계를 저장하는 sum이라는 변수
		int i = 1;
		
		while(i<=100)	//i는 1부터 100보다 작거나 같을 떄까지 반복을 할 것.
		{
			sum += i;
			i++;
		}
		System.out.println("1부터 " + (i-1) + "까지의 합: " + sum);
	}
}