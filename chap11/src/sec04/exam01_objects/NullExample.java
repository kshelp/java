package sec04.exam01_objects;

import java.util.Objects;
import java.util.function.Supplier;

public class NullExample {
	public static void main(String[] args) {		
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");  
			String name = Objects.requireNonNull(str2, new Supplier<String>() {
				@Override
				public String get() {
					return "이름이 없다니깐요";
				}
			});  //함수적 인터페이스 -> 람다식
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
