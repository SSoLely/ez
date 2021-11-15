package d211006;
public class N11_AdvancedForExample
{
	public static void main(String[] args)
	{
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for (int score : scores)	//배열에서 값 하나씩 꺼내서 score에 저장한 다음에,
		{
			sum = sum + score;		//score를 더해준다.
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	} 
}