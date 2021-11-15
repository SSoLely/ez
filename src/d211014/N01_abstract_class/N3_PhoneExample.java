package d211014.N01_abstract_class;
public class N3_PhoneExample
{
	public static void main(String[] args)
	{
		//Phone phone = new Phone(); (x)
		
		N2_SmartPhone smartPhone = new N2_SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}