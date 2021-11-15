package d211006;
public class N09_ArrayCopyByForExample
{
	public static void main(String[] args)
	{
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];			//5개를 저장할 수 있는 배열.
		
		for(int i=0; i<oldIntArray.length; i++)	//oldIntArray.length=3 //0, 1, 2 세 번 반복.
		{
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++)	//newIntArray.length=5 //0, 1, 2, 3, 4 다섯 번 반복해서 출력.
		{
			System.out.print(newIntArray[i] + ", ");
		}
	}
}