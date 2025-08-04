public class Menu {

  public void showMainMenu() {
    System.out.println("""
                       --- Learn Words App ---
                       1. Practice
                       2. Create vocabulary
                       3. Edit vocabulary
                       4. Stats
                                   
                       5. Exit
                          Are you sure you want to exit(Y/N)?
                                   
                       Type selection number:
                       """);
  }

  public void practice() {
    System.out.println("""
                       ---Select the dictionary file from the list---
                         1. Animals EN-LT.txt
                         2. Fruits EN-LT.txt
                         3. Clothes LT-EN.txt
                         
                         4. Main menu
                         5. Exit
                       """);
  }

  public void createVocabulary() {
    System.out.println("""
                       Welcome to create vocabulary menu 
                        
                       1. Main menu
                       2. Exit
                       """);
  }
}

/*






   prompt message ---Resume (y/n)?---
 */