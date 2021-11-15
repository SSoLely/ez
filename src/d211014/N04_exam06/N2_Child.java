package d211014.N04_exam06;

public class N2_Child extends N1_Parent
{
	private String name;
	
	public N2_Child()
	{
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public N2_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}