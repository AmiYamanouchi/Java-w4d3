package practice1;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
	
		for(int i = 0; i < 10; i++) {
			list.add("Item - " + i);
		}
		
		for(String j : list) {
			System.out.println(j);
		}
		
		
	}

}
