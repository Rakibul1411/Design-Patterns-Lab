// Concrete Factory 2: Mac Factory

public class MacFactory implements GUIFactory {
  
  public Button createButton() {
    return new MacButton();
  }

  public Checkbox creatCheckbox() {
    return new MacCheckbox();
  }
}
