package d211001;
public class N21_Exercise04
{
	public static void main(String[] args)
	{
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = ( pencils / students );	//534를 30으로 나눈 몫
		System.out.println(pencilsPerStudent);			//출력
		
		int pencilsLeft = ( pencils % students );		//534를 30으로 나눈 나머지
		System.out.println(pencilsLeft);				//출력
	}
}