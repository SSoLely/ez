package d211005;
public class  N31_ContinueExample
{
	public static void main(String[] args) throws Exception
	{
		for(int i=1; i<=10; i++)	//i는 1부터 10까지 10번 반복.
		{
			if(i%2 != 0)			//조건: i를 2로 나눈 나머지가 0이 아니면,
									//숫자를 2로 나눴을 때 0이 나오면 짝수다. 2로 나눴을 때 나머지가 0이 아니면 홀수다.
									//조건: i가 홀수면,
			{
				continue;			//건너뛴다.
			}
			System.out.println(i);	//아니면 출력한다.
		}
	}
}