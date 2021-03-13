package chap06;

class Phone {
	protected String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner + "�� ��ȭ ���̴�.");
	}
}

class Telephone extends Phone {
	private String when;

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	void autoAnswering() {
		System.out.println(owner + "�� ���� ���̴�." + when + " ��ȭ �ٷ�.");
	}
}

class Smartphone extends Telephone {
	private String game;

	public Smartphone(String owner, String color, String game) {
		super(owner, color);
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + "�� " + game + " ������ �ϴ� ���̴�.");
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("Ȳ����"), new Telephone("�浿��", "����"), new Smartphone("�α���", "������", "������") };

		for (Phone p : phones) {
			if (p instanceof Smartphone)
				((Smartphone) p).playGame();
			else if (p instanceof Telephone)
				((Telephone) p).autoAnswering();
			else
				p.talk();
		}
	}
}