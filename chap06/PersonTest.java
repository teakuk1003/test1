package chap06;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	public String show() {
		return "���[�̸� : " + name + ", ���� : " + age + "]";
	}
}

class Student extends Person {
	int number;

	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	public String show() {
		return "�л�[�̸� : " + name + ", ���� : " + age + ", �й� : " + number + "]";
	}
}

class ForeignStudent extends Student {
	String nationality;

	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name, age, number);
		this.nationality = nationality;
	}

	String getNationality() {
		return nationality;
	}

	void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String show() {
		return "�ܱ��л�[�̸� : " + name + ", ���� : " + age + ", �й� : " + number + ", ���� : " + nationality + "]";
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person[] persons = { new Person("�浿��", 22), new Student("Ȳ����", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };

		for (Person p : persons)
			System.out.println(p.show());
	}
}
