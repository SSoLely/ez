package d211006;
public class N07_ArrayInArrayExample
{
	public static void main(String[] args)
	{
		int[][] mathScores = new int[2][3];				//int 타입의 mathScores라고 하는 2차원 배열을 만든다.	//int 타입인데 아무것도 안 넣어놨기 때문에 값은 다 0이 들어가 있다.
		for(int i=0; i<mathScores.length; i++)			//mathScores.length는 1차원 배열의 크기=2			//0과 1 두 번 반복.
		{
			for(int k=0; k<mathScores[i].length; k++)	//mathScores[i].length는 2차원에 대한 개수=3			//0, 1, 2 세 번 반복한다.
			{
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);				//경우의 수(i,k): (0,0), (0,1), (0,2), (1,0), (1,1), (1,2)
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];				//1차원은 2, 2차원 배열의 개수는 정해지지 않았다. 가변 배열.
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++)			//englishScores.length=2
		{
			for(int k=0; k<englishScores[i].length; k++)	//i 인덱스가 0인 경우에는 2, 인덱스가 1인 경우에는 3이다.
			{
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };	//2차원 배열을 만들 때, 값까지 넣는 방법: 중괄호{} 블록을 쓰면 된다. 배열 생성과 동시에 값을 넣고 싶을 때.
		for(int i=0; i<javaScores.length; i++)
		{
			for(int k=0; k<javaScores[i].length; k++)
			{
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
	} 
}