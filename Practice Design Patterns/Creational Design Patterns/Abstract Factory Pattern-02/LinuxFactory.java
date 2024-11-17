// Concrete Factory 3: Linux Factory

public class LinuxFactory implements GUIFactory {

  public Button createButton() {
    return new LinuxButton();
  }

  public Checkbox creatCheckbox() {
    return new LinuxCheckbox();
  }
}