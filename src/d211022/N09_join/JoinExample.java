package d211022.N09_join;
public class JoinExample
{
	public static void main(String[] args)
	{
		SumThread sumThread = new SumThread();
		sumThread.start();
		try
		{
			sumThread.join();
		}
		catch (InterruptedException e) {}
		System.out.println("1부터 100까지의 합: " + sumThread.getSum());
	}
}