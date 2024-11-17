// Client Code

public class Application {
  
  private Button button;
  private Checkbox checkbox;

  public Application (GUIFactory factory) {
    this.button = factory.createButton();
    this.checkbox = factory.creatCheckbox();
  }

  public void render() {
    button.paint();
    checkbox.paint();
  }

}
