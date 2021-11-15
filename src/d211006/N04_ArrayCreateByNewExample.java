package d211006;
public class N04_ArrayCreateByNewExample
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[3];								//값을 안 넣으면, int 타입의 기본값은 0이니까 0이 저장된다.
		for(int i=0; i<3; i++)									//0,1,2 세 번 반복.
		{
			System.out.println("arr1[" + i + "] : " + arr1[i]);	//배열에는 0이 들어있기 때문에 0이 출력.
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++)
		{
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		double[] arr2 = new double[3];							//double형의 배열.
		for(int i=0; i<3; i++)
		{
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++)
		{
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		String[] arr3 = new String[3];							//String 타입으로 배열을 생성. 참조 타입은 기본값으로 들어가는 게 null이다.
		for(int i=0; i<3; i++)
		{
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++)
		{
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}