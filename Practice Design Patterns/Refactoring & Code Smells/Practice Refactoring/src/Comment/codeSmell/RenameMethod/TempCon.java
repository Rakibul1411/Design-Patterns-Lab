package Comment.codeSmell.RenameMethod;

public class TempCon {
    // Converts Celsius to Fahrenheit
    public double convTemp(double t) {
        return (t * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public double tempConvRev(double temp) {
        return (temp - 32) * 5 / 9;
    }
}
