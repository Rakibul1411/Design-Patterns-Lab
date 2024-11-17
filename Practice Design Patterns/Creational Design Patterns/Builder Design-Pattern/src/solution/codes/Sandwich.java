package solution.codes;

public class Sandwich {
    private String breadType;
    private String filling;
    private String spread;

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getBreadType() {
        return this.breadType;
    }

    public String getFilling() {
        return this.filling;
    }

    public String getSpread() {
        return this.spread;
    }

    public String toString() {
        return "BreadType: " + breadType + ", Filling: " + filling + ", Spread: " + spread;
    }
}
