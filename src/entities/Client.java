package entities;

public abstract class Client {
	private String name;
	protected double anualIncome;

	public Client() {
	}
	
	public Client(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the anualIncome
	 */
	public double getAnualIncome() {
		return anualIncome;
	}

	/**
	 * @param anualIncome the anualIncome to set
	 */
	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public double getTaxe() {
		return 0.0;
	}
	

}
