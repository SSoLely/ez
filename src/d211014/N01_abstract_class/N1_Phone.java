package d211014.N01_abstract_class;
public abstract class N1_Phone
{
	//�ʵ�
	public String owner;
	
	//������
	public N1_Phone(String owner)
	{
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn()
	{
		System.out.println("�� ������ �մϴ�.");
	}	
	public void turnOff()
	{
		System.out.println("�� ������ ���ϴ�.");
	}
}