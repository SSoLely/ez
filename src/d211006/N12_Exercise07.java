package d211006;
public class N12_Exercise07
{
	public static void main(String[] args)
	{
	    int max = 0;
	    int[] array = { 1, 5, 3, 8, 2 };
	 
		for(int i=0; i<array.length; i++)	//array.length=5 //0,1,2,3,4 다섯 번 반복한다.
		{
			if(max<array[i])
			{
				max = array[i];				//(max=0)<(인덱스0=1)	//max=1
											//(max=1)<(인덱스1=5)	//max=5
											//(max=5)>(인덱스2=3)	//max=5
											//(max=5)<(인덱스3=8)	//max=8
											//(max=8)>(인덱스5=2)	//max=8
			}
		}
	    System.out.println("max: " + max);
	}
}