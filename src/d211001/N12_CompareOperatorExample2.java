package d211001;
public class N12_CompareOperatorExample2
{
	public static void main(String[] args)
	{
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);						//1과 1.0은 같다.					//true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);														//false
		System.out.println((float)v4 == v5);												//true
		System.out.println((int)(v4*10) == (int)(v5*10));	//0.1*10=1.0인데 int로 바꿔서 1		//true
	}
}