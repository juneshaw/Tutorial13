
class Person {
	String name;
	int age;
}
public class App {

	public static void main(String[] args) {
		// Create an instance of the object.
		Person person1 = new Person();
		person1.name = "June";
		person1.age = 19;
		
		Person person2 = new Person();
		person2.name = "Jeff";
		person2.age = 18;
		
		System.out.println(person1.name);
		System.out.println(person2.age);

	}

}
