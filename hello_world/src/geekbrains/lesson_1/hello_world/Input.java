package geekbrains.lesson_1.hello_world;

import java.util.Scanner;

public class Input {

	private Scanner sc = new Scanner(System.in);

	public String readLine() {
		String r;
		do {
			r = sc.nextLine();
		} while (r == null && r.trim().length() == 0);
		return r;
	}

}
