package d211006;
public class N13_Exercise08
{
	public static void main(String[] args)
	{
		int[][] array = { 
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};	

		int sum = 0;
		double avg = 0.0;

		int count = 0;
		for(int i=0; i<array.length; i++)			//array.length=3 //0,1,2 세 번 반복.
		{
			for(int j=0; j<array[i].length; j++)	//2차원의 개수
			{
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}