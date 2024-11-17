class Dog extends Canine {
  private int age;

  public Dog(String species, String furColor, String breed, int age) {
      super(species, furColor, breed);
      this.age = age;
  }

  @Override
  protected Dog manualClone() {
      return new Dog(super.getSpecies(), super.getFurColor(), super.getBreed(), this.age);
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }
}