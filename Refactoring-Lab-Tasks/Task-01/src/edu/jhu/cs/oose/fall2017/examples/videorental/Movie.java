package edu.jhu.cs.oose.fall2017.examples.videorental;


public class Movie {
  private String title;
  private PriceCalculator priceCalculator;

  public Movie(String title, PriceCalculator priceCalculator) {
      this.title = title;
      this.priceCalculator = priceCalculator;
  }

  public String getTitle() {
      return title;
  }

  public double calculateAmount(int daysRented) {
      return priceCalculator.calculateAmount(daysRented);
  }
}