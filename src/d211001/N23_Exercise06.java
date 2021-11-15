package d211001;
public class N23_Exercise06
{
	public static void main(String[] args)
	{
		int lengthTop = 5;							//윗면에 대한 변수: LengthTop
		int lengthBottom = 10;						//밑면에 대한 값 = 10
		int height = 7;								//높이 = 7
		double area = (   (10+5) * 7 / 2.0    );	//(윗면+밑면)*높이/2 //double형으로 작업 안 해주면 소수점자리가 안 나온다.
		System.out.println(area);
	}
}