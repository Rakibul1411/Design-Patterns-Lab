// Concrete Factory 1: Windows Factory

public class WindowsFactory implements GUIFactory{
    
  public Button createButton() {
    return new WindowsButton();
  }

  public Checkbox creatCheckbox() {
    return new WindowsCheckbox();
  }
}