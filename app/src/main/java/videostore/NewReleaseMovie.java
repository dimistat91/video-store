package videostore;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title);
	}

	public double amount(int daysRented) {
		return daysRented * 3;
	}

	public int points(int daysRented) {
		if (daysRented > 1)
			return 2;
		else
			return 1;
	}
}
