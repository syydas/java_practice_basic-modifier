public class Application {

  public static void main(String[] args) {
    Student cindy = new Student("Cindy", 80);
    Student mary = new Student("Mary", 95);
    Teacher solider = new Teacher("Solid", mary);
    Teacher bob = new Teacher("Bob", cindy);
  }

}
