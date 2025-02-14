package sec03.exam04_clone;

public class ShallowCopyExample {

	public static void main(String[] args) {
		
	      try {
	            Address address = new Address("Seoul", "Gangnam");
	            Person person1 = new Person("John", address);

	            // 얇은 복제 수행
	            Person person2 = (Person) person1.clone();

	            System.out.println("원본 객체: " + person1);
	            System.out.println("복제된 객체: " + person2);
	            
	            // 원본 객체와 복제된 객체의 address 필드가 동일한 참조를 가리키는지 확인
	            System.out.println("address 필드가 동일한 객체를 참조하는가? " + (person1.address == person2.address));

	            // 복제된 객체의 address 변경
	            person2.address.city = "Busan";
	            System.out.println("원본 객체 address 변경 후: " + person1);
	            System.out.println("복제된 객체 address 변경 후: " + person2);

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }

	}

}


class Address {
    String city;
    String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', street='" + street + "'}";
    }
}


class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 얇은 복제 구현
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}
