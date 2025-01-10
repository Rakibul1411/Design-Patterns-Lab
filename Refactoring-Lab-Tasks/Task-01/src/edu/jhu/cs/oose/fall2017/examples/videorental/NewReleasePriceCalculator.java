package edu.jhu.cs.oose.fall2017.examples.videorental;

public class NewReleasePriceCalculator implements PriceCalculator {
  @Override
  public double calculateAmount(int daysRented) {
      return daysRented * 3;
  }
}