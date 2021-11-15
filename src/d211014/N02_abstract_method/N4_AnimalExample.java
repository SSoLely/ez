package d211014.N02_abstract_method;
public class N4_AnimalExample {
	public static void main(String[] args) {
		N2_Dog dog = new N2_Dog();
		N3_Cat cat = new N3_Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		N1_Animal animal = null;
		animal = new N2_Dog();
		animal.sound();
		animal = new N3_Cat();
		animal.sound();
		System.out.println("-----");
		
		//�Ű������� �ڵ� Ÿ�� ��ȯ
		animalSound(new N2_Dog());
		animalSound(new N3_Cat());
	}
	
	public static void animalSound(N1_Animal animal) {
		animal.sound();
	}
}