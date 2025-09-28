import java.util.ArrayList;
import java.util.List;

public class Student {

  private static double counter = 1000;
  private String id;
  private String firstName;
  private String lastName;
  private List<Word> vocabularies;

  public Student(String firstName, String lastName) {
    this.id = String.valueOf(counter++);
    this.firstName = firstName;
    this.lastName = lastName;
    this.vocabularies = new ArrayList<>(20);
  }
}
