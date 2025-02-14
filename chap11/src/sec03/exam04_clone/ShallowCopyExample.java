package sec03.exam04_clone;

public class ShallowCopyExample {

	public static void main(String[] args) {
		
	      try {
	            Address address = new Address("Seoul", "Gangnam");
	            Person person1 = new Person("John", address);

	            // ���� ���� ����
	            Person person2 = (Person) person1.clone();

	            System.out.println("���� ��ü: " + person1);
	            System.out.println("������ ��ü: " + person2);
	            
	            // ���� ��ü�� ������ ��ü�� address �ʵ尡 ������ ������ ����Ű���� Ȯ��
	            System.out.println("address �ʵ尡 ������ ��ü�� �����ϴ°�? " + (person1.address == person2.address));

	            // ������ ��ü�� address ����
	            person2.address.city = "Busan";
	            System.out.println("���� ��ü address ���� ��: " + person1);
	            System.out.println("������ ��ü address ���� ��: " + person2);

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

    // ���� ���� ����
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}
