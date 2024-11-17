package solution.codes;

public class MenuBuilder implements Builder{
    private Menu menu;

    public MenuBuilder() {
        this.reset();
    }

    @Override
    public void setBreadType(String breadType) {
        menu.setBreadType(breadType);
    }

    @Override
    public void setFilling(String filling) {
        menu.setFilling(filling);
    }

    @Override
    public void setSpread(String spread) {
        menu.setSpread(spread);
    }

    @Override
    public void reset() {
        this.menu = new Menu();
    }

    public Menu getMenu() {
        return this.menu;
    }
}
