package d211006;
public class N05_ArrayLengthExample
{
	public static void main(String[] args)
	{
		int[] scores = { 83, 90, 87 };		//배열을 생성.
		
		int sum = 0;						//배열의 합계를 구하기 위해서 변수를 만들어 준다.
		for(int i=0; i<scores.length; i++)	//i는 0부터 이 배열의 크기. 배열에 3개 저장되어 있기 때문에, 크기도 3이다.
		{
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
	}
}