import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//Person Class
class Person {
	private String name;
	private Integer age;
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static int compareByName(Person p, Person p2) {
		return p.getName().compareTo(p2.getName());
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

// An FI to get an instance of Person
@FunctionalInterface
interface MyInterface {
	Person getPerson(String name, int age);
}

// Driver class
public class Question2 {
	public static void main(String[] args) {
		MyInterface personCons = Person :: new; // constructor ref

		List<Person> pl = Arrays.asList(new Person[]{personCons.getPerson("Deba", 1), personCons.getPerson("Abhik", 2), personCons.getPerson("Shivam", 3)});
		
		Collections.sort(pl, Person::compareByName);	// Sort by name
		System.out.println(pl);
	}
}
