package solution.codes;

public class Sandwich {
    private final String breadType;
    private final String filling;
    private final String spread;

    public Sandwich(String breadType, String filling, String spread) {
        this.breadType = breadType;
        this.filling = filling;
        this.spread = spread;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getFilling() {
        return filling;
    }

    public String getSpread() {
        return spread;
    }

    @Override
    public String toString() {
        return breadType + " " + filling + " " + spread;
    }
}
