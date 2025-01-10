void printOwing() {
  printBanner();
  printDetails(getOutstanding());
}


printDetails(double outstanding) {
  System.out.println("name: " + name);
  System.out.println("amount: " + outstanding);
}