package chap07;

abstract class Controller {
	boolean power;

	public Controller(boolean power) {
		super();
		this.power = power;
	}

	void show() {
		if (power == true)
			System.out.println(getName() + "�� �������ϴ�.");
		else
			System.out.println(getName() + "�� �������ϴ�.");
	}

	abstract String getName();
}

class TV extends Controller {
	public TV(boolean power) {
		super(power);
	}

	String getName() {
		return "TV";
	}
}

class Radio extends Controller {
	public Radio(boolean power) {
		super(power);
	}

	String getName() {
		return "����";
	}
}

public class ControllerTest {
	public static void main(String[] args) {
		Controller[] c = { new TV(false), new Radio(true) };

		for (Controller controller : c)
			controller.show();
	}
}
