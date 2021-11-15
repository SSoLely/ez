package d211006;
public class N03_ArrayCreateByValueListExample2
{
	public static void main(String[] args)
	{
		int[] scores;						//int 타입 [scores]라는 배열을 선언했다.
		scores = new int[] { 83, 90, 87 };	//배열을 생성 후 값을 넣어주고 있다.
		int sum1 = 0;
		for(int i=0; i<3; i++)
		{
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);	
		
		int sum2 = add( new int[] { 83, 90, 87 } );
		System.out.println("총합: " + sum2);	
		System.out.println();
	}
	
	public static int add(int[] scores)		//add라는 메소드는 동작을 하려면 배열을 받아야 된다. 83, 90, 87이라는 값을 이 메소드에 넣어준다.
	{
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		return sum;
	}
}