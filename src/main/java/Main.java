import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int option = scanner.nextInt();
    boolean flag = true;
    Menu menu = new Menu();
    menu.showMainMenu();
/*
            --- Learn Words App ---
            1. Practice
            2. Create vocabulary
            3. Edit vocabulary
            4. Stats

            5. Exit
               Are you sure you want to exit(Y/N)?

            Type selection number:
            """);

*/

    while (flag) {
      switch (option) {
        case 1 -> menu.practice();
        case 2 -> menu.createVocabulary();
        //        case 3 -> menu.editVocabulary();
        //        case 4 -> menu.stats();
        default -> flag = false;
      }

      flag = false;
    }
  }
}