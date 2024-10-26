class Mammal extends Animal {
  private String furColor;

  public Mammal(String species, String furColor) {
      super(species);
      this.furColor = furColor;
  }

  @Override
  protected Mammal manualClone() {
      return new Mammal(super.getSpecies(), this.furColor);
  }

  public String getFurColor() {
      return furColor;
  }

  public void setFurColor(String furColor) {
      this.furColor = furColor;
  }
}
