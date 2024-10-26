public class MathFacade {
  private static ComplexMathOperations mathOperations = new ComplexMathOperations();

  public static double squareRoot(double number) {
    return mathOperations.squareRoot(number);
  }

  public static double power(double base, double exponent) {
    return mathOperations.power(base, exponent);
  }

  public static double logarithm(double value) {
    return mathOperations.logarithm(value);
  }

}
