package d210930;
public class N17_DenyLogicOperatorExample
{
	public static void main(String[] args)
	{
		boolean play = true;
    System.out.println(play);	//true

    play = !play;
    System.out.println(play);	//false

    play = !play;
    System.out.println(play);	//true
	}
}