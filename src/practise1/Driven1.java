package practise1;

import java.io.IOException;
import java.util.ArrayList;

public class Driven1 {

	public static void main(String[] args) throws IOException {
		Driven d = new Driven();
		ArrayList a = d.getData("bharat");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));

		
	}

}
