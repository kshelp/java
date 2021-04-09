package verify.exam00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		//Set s = new HashSet();
		//TreeSet s = new TreeSet();
		
		Random r = new Random();		
		
		/*
		while(true){
			n = r.nextInt(45)+1; // 1 ~ 45 난수 발생
			s.add(n);
			if(s.size() == 6){
				System.out.println(s);
				
				// 정렬하기
				List list = new ArrayList(s);
				Collections.sort(list);
				System.out.println(list);
				
				break;
			}
		}
		*/
		
		Set t = new HashSet();
		while(t.size()!=45) {
			t.add(r.nextInt(45)+1);
		}
		System.out.println(t);
		
	}

}
