public class Main {
  public static void main(String[] args) {
      // Original Address and Student
      Address address = new Address("New York", "10001");
      Student originalStudent = new Student("John Doe", address);

      // Deep copy of Student
      Student clonedStudent = new Student(originalStudent);

      // Print original and cloned Student's Address
      System.out.println("Original Student Address: " + originalStudent.getAddress().getCity());
      System.out.println("Cloned Student Address: " + clonedStudent.getAddress().getCity());

      // Modify the original student's address
      originalStudent.getAddress().setCity("Los Angeles");

      // Print addresses after modification
      System.out.println("Original Student Address after modification: " + originalStudent.getAddress().getCity());
      System.out.println("Cloned Student Address after modification: " + clonedStudent.getAddress().getCity());
  }
}
