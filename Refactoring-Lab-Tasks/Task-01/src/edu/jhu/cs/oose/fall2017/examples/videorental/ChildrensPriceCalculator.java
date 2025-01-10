package edu.jhu.cs.oose.fall2017.examples.videorental;

public class ChildrensPriceCalculator implements PriceCalculator {
  @Override
  public double calculateAmount(int daysRented) {
      double amount = 1.5;
      if (daysRented > 3)
          amount += (daysRented - 3) * 1.5;
      return amount;
  }
}
