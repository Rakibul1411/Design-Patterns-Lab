package edu.jhu.cs.oose.fall2017.examples.videorental;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<Rental>();

  public Customer(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public void addRental(Rental rental) {
      this.rentals.add(rental);
  }

  public String generateStatement() {
      Formatter formatter = new Formatter();
      formatter.format("Rental Record for %s\n", getName());

      double totalAmount = calculateTotalAmount();
      int frequentRenterPoints = calculateTotalFrequentRenterPoints();

      for (Rental rental : this.rentals) {
          formatter.format("    %-40s  (%02d)  $%5.2f\n", rental.getMovie().getTitle(), rental.getDaysRented(), rental.calculateAmount());
      }

      formatter.format("Amount owed is $%5.2f\n", totalAmount);
      formatter.format("You earned %d frequent renter points", frequentRenterPoints);

      String result = formatter.out().toString();
      formatter.close();
      return result;
  }

  private double calculateTotalAmount() {
      double totalAmount = 0;
      for (Rental rental : this.rentals) {
          totalAmount += rental.calculateAmount();
      }
      return totalAmount;
  }

  private int calculateTotalFrequentRenterPoints() {
      int frequentRenterPoints = 0;
      for (Rental rental : this.rentals) {
          frequentRenterPoints += rental.calculateFrequentRenterPoints();
      }
      return frequentRenterPoints;
  }
}