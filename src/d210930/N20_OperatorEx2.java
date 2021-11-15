package d210930;
class N20_OperatorEx2
{
	public static void main(String args[])
	{
		int i=5;
		int j=0;
		j = i++;												//j=5
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);	//j=5, i=6

		i=5;
		j=0;
		j = ++i;												//i=6
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);	//i=6, j=6
	}
}