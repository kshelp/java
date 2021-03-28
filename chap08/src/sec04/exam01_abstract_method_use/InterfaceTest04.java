package sec04.exam01_abstract_method_use;

interface IHello4 { // 인터페이스
	void sayHello(String name); // public abstract를 생략할 수 있다.
}

abstract class GoodBye4 { // 추상 클래스
	public abstract void sayGoodBye4(String name); // public abstract를 생략할 수 없다.
}

class SubClass4 extends GoodBye4 implements IHello4 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye4(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

public class InterfaceTest04 {
	public static void main(String[] args) {
		SubClass4 test = new SubClass4();
		test.sayHello("홍길동");
		test.sayGoodBye4("이순신");
	}
}
