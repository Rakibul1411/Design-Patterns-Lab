class Labrador extends Dog {
  private boolean trained;

  public Labrador(String species, String furColor, String breed, int age, boolean trained) {
      super(species, furColor, breed, age);
      this.trained = trained;
  }

  @Override
  protected Labrador manualClone() {
      return new Labrador(super.getSpecies(), super.getFurColor(), super.getBreed(), super.getAge(), this.trained);
  }

  public boolean isTrained() {
      return trained;
  }

  public void setTrained(boolean trained) {
      this.trained = trained;
  }
}