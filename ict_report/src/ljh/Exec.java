package ljh;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸�:");
		String name = scan.nextLine();

		System.out.println("����:");
		String age = scan.nextLine();

		int ageR = Integer.parseInt(age);

		Person p = new Person(name, ageR);
		System.out.println(p.toString());

	}

}
