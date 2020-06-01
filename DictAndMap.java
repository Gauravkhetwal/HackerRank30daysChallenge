package hackerrank;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class DictAndMap {

	public static void main(String[] args) {
		Map<String,Long> matching = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		String key = scan.next();
		Long phoneno = scan.nextLong();
		
		
		matching.put(key, phoneno);
		
		System.out.println(matching.get(phoneno));

		System.out.println(matching.get(key));

		scan.close();
		
	}

}
