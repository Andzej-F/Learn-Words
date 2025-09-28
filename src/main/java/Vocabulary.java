import java.util.ArrayList;
import java.util.List;

public class Vocabulary {

  private static double counter = 1000;
  private String id;
  private String name;
  private int size;
  private List<Word> vocabulary;

  public Vocabulary(String name, int size) {
    this.id = String.valueOf(counter++);
    this.name = name;
    this.size = size;
  }
}
