package edu.jhu.cs.oose.fall2017.examples.videorental;

public class RegularPriceCalculator implements PriceCalculator {
  @Override
  public double calculateAmount(int daysRented) {
      double amount = 2;
      if (daysRented > 2)
          amount += (daysRented - 2) * 1.5;
      return amount;
  }
}