public class Animal {
  private String species;

  public Animal(String species) {
      this.species = species;
  }

  protected Animal manualClone() {
      return new Animal(this.species);
  }

  public String getSpecies() {
      return species;
  }

  public void setSpecies(String species) {
      this.species = species;
  }
}