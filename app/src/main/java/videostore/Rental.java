package videostore;

public class Rental {

	private Movie movie;
	int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public String getTitle() {
		return movie.getTitle();
	}

	public int points() {
		return movie.points(daysRented);
	}

	double amount() {
		return movie.amount(daysRented);
	}
}