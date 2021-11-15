package d211001;
public class N19_Exercise02
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);	//x=11 //y=20 //11 + 20 = 31
		System.out.println(z);
	}
}