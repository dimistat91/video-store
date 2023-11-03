package videostore;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title);
	}

	public double amount(int daysRented) {
		double amount = 2;
		if (daysRented > 2)
			amount += (daysRented - 2) * 1.5;
		return amount;
	}

	public int points(int daysRented) {
		return 1;
	}
}
