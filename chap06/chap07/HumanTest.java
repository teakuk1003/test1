package chap07;

interface Human {
	void eat();
	
	default void print() {
		System.out.println("�ΰ��Դϴ�.");
	}
	
	static void echo() {
		System.out.println("��ȣ!!!");
	}
}

class Worker implements Human {
	@Override
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");	
	}
}

class Student implements Human {
	int age;

	public Student(int age) {
		super();
		this.age = age;
	}

	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");		
	}

	@Override
	public void print() {
		System.out.println("���� �л��Դϴ�.");
	}
	
}

public class HumanTest {
	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Worker p = new Worker();
		p.print();
		p.eat();	
	}
}