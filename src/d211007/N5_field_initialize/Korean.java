package d211007.N5_field_initialize;
public class Korean
{
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean()							//기본 생성자를 하나 만든다.
	{	
	}
	
	public Korean(String name, String ssn)	//넣어준 값을 이용해서 name과 ssn의 값을 설정한다.
	{
	  this.name = name;						//클래스 블록에 있는 필드를 지칭해 주기 위해서 this를 붙여준다.
	  this.ssn = ssn;						//this.변수명: 클래스가 가지고 있는 필드를 지칭한다.
	}
}