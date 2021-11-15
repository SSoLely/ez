package d211006;
public class N02_ArrayCreateByValueListExample1
{
	public static void main(String[] args)
	{
		int[] scores = { 83, 90, 87 };					//int 타입의 배열을 생성.
		
		System.out.println("scores[0] : " + scores[0]);	//인덱스 0에 해당하는 것은 83
		System.out.println("scores[1] : " + scores[1]);	//1에 해당하는 것은 90
		System.out.println("scores[2] : " + scores[2]);	//2에 해당하는 것은 87
		
		int sum = 0;
		for(int i=0; i<3; i++)	//이렇게 조건을 준 이유: 인덱스 0, 1, 2만 필요하기 때문. 인덱스에 대한 반복을 하겠다는 말.
		{
			sum += scores[i];	//첫 번째 반복: sum=0+83=83
								//두 번째 반복: sum=83+90=173
								//세 번째 반복: sum=183+87=260
		}
		System.out.println("총합: " + sum);		
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);
	}
}