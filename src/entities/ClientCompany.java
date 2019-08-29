package entities;

public class ClientCompany extends Client {
	private int numberEmployees;

	public ClientCompany() {
	}

	public ClientCompany(String name, double anualIncome, int numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	public double getTaxe() {
		double valueTaxe;
		
		if (numberEmployees > 10) {
			valueTaxe = anualIncome * 0.14;
		} else {
			valueTaxe = anualIncome * 0.16;
		}
		
		return valueTaxe;
	}
	
}
