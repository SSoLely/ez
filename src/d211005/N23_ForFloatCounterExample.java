package d211005;
public class N23_ForFloatCounterExample
{
	public static void main(String[] args)
	{
		for(float x=0.1f; x<=1.0f; x+=0.1f)	//x는 0.1에서부터 1.0까지 0.1씩 증가하면서 반복을 한다.
		{
			System.out.println(x);
		}
	}
}