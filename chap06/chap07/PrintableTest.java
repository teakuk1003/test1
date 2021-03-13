package chap07;

interface Printable {}

class A4 implements Printable {  
	public void a() {
		System.out.println("A4");
	}  
}

class B4 implements Printable {  
	public void b() {
		System.out.println("B4");
	}  
}  
  
class Call {  
	void invoke(Printable p) { 
		if(p instanceof A4) {  
			A4 a=(A4)p;   
			a.a();  
		}  
		if(p instanceof B4) {  
			B4 b=(B4)p;   
			b.b();  
		}
	}  
}

public class PrintableTest {
	public static void main(String[] args){  
		Printable p = new B4();  
		Call c = new Call();  
		c.invoke(p);  
	}  
}