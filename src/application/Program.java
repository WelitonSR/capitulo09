package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.ClientCompany;
import entities.ClientIndividual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Client> listClient = new ArrayList<>();
		double totalTaxes = 0.0;

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual ou company (i/c)? ");
			char clientType = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			if (clientType == 'i') {
				System.out.print("Healt expenditures: ");
				double valueHealt = sc.nextDouble();
				sc.nextLine();
				listClient.add(new ClientIndividual(name, anualIncome, valueHealt));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				sc.nextLine();
				listClient.add(new ClientCompany(name, anualIncome, numberEmployees));
			}
		}
		System.out.println("TAXES PAID: ");
		
		for (Client obj : listClient) {
			System.out.println(obj.getName() + ": $ " + obj.getTaxe());
			totalTaxes += obj.getTaxe();
		}
		
		
		System.out.print("TOTAL TAXES: $ " + totalTaxes );
		
		sc.close();
		
	}

}
