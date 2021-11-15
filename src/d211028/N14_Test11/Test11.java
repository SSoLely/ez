package d211028.N14_Test11;
import java.text.DecimalFormat;
public class Test11
{
	public static void main(String[] args)
	{
		int money = 27000;
		
		DecimalFormat df = new DecimalFormat("0");
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(money));
	}
}