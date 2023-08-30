package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Acount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Acount acount;

		System.out.println("Enter acount number: ");
		int number = sc.nextInt();

		System.out.print("Enter acount holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Is there an initial deposit (Y/N) ?: ");
		char reponse = sc.next().charAt(0);

		if (reponse == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acount = new Acount(number, name, initialDeposit);
		} else {
			acount = new Acount(number, name);
		}

		System.out.println();
		System.out.println("Acount data: ");
		System.out.println(acount);

		System.out.println();
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		acount.deposit(depositValue);
		System.out.println("Update acount data: ");
		System.out.print(acount);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acount.withdraw(withdrawValue);
		System.out.println("Update acount data: ");
		System.out.print(acount);

		sc.close();
	}

}
