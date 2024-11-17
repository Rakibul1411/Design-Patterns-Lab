class Canine extends Mammal {
  private String breed;

  public Canine(String species, String furColor, String breed) {
      super(species, furColor);
      this.breed = breed;
  }

  @Override
  protected Canine manualClone() {
      return new Canine(super.getSpecies(), super.getFurColor(), this.breed);
  }

  public String getBreed() {
      return breed;
  }

  public void setBreed(String breed) {
      this.breed = breed;
  }
}
