package solution.codes;

public class MenuBuilder implements Builder{
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

    public Menu getResult() {
        return new Menu(breadType, filling, spread);
    }

    public void reset() {
        breadType = null;
        filling = null;
        spread = null;
    }
}
