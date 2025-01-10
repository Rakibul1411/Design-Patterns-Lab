package edu.jhu.cs.oose.fall2017.examples.videorental;

public class Rental {
  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented) {
      this.movie = movie;
      this.daysRented = daysRented;
  }

  public Movie getMovie() {
      return movie;
  }

  public int getDaysRented() {
      return daysRented;
  }

  public double calculateAmount() {
      return movie.calculateAmount(daysRented);
  }

  public int calculateFrequentRenterPoints() {
      int points = 1;
      if (movie.calculateAmount(daysRented) > 2 && daysRented > 1) {
          points++;
      }
      return points;
  }
}