package sec03.exam04_clone;

public class CloneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"홍길동", "이순신", "김유신", "안중근"};
		
		String[] arr2 = arr.clone();  // 깊은 복제
		
		System.out.println(arr == arr2);
		
		for(String name: arr2) {
			System.out.println(name);
		}
		
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);  // 깊은 복제
		
		System.out.println(arr == arr3);
		
		for(String name: arr3) {
			System.out.println(name);
		}
	}

}
