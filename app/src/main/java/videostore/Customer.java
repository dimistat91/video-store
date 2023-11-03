package videostore;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String statement() {
		String statement = printHeader();
		for (Rental rental : rentals) {
			statement += printLineFor(rental);
		}
		statement += printFooter();
		return statement;
	}

	private String printHeader() {
		return "Rental Record for " + name + "\n";
	}

	private String printLineFor(Rental rental) {
		return "\t" + rental.getTitle() + "\t" + rental.amount() + "\n";
	}

	private String printFooter() {
		return "Amount owed is " + totalAmount() + "\n" + "You earned "
				+ frequentRenterPoints() + " frequent renter points";
	}

	private double totalAmount() {
		double totalAmount = 0;
		for (Rental rental : rentals) {
			totalAmount += rental.amount();
		}
		return totalAmount;
	}

	private int frequentRenterPoints() {
		int frequentRenterPoints = 0;
		for (Rental rental : rentals) {
			frequentRenterPoints += rental.points();
		}
		return frequentRenterPoints;
	}
}