package entities;

public class ClientIndividual extends Client {
	private double healtExpenditures;
	
	public ClientIndividual() {
	}

	public ClientIndividual(String name, double anualIncome, double healtExpenditures) {
		super(name, anualIncome);
		this.healtExpenditures = healtExpenditures;
	}

	public double getHealtExpenditures() {
		return healtExpenditures;
	}

	public void setHealtExpenditures(double healtExpenditures) {
		this.healtExpenditures = healtExpenditures;
	}

	public double getTaxe() {
		double valueTaxe;
		
		if (anualIncome < 20000) {
			valueTaxe = (anualIncome * 0.15) - (healtExpenditures * 0.5);
		} else {
			valueTaxe = (anualIncome * 0.25) - (healtExpenditures * 0.5);
		}
		
		return valueTaxe;
	}
	
}
