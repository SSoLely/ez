package d211014.N04_exam06;
public class N1_Parent {
	public String nation;
	
	public N1_Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public N1_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}