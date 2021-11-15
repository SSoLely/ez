package d211026.N07_comparable;
import java.util.Iterator;
import java.util.TreeSet;
public class ComparableExample
{
	public static void main(String[] args)
	{
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("이솔", 31));
		treeSet.add(new Person("박꼬득", 30));
		treeSet.add(new Person("신희진", 33));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
	}
}