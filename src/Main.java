import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PortalManager manager = new PortalManager();
        Scanner scanner = new Scanner(System.in);
        
      
        manager.reportItem("Dell Laptop Charger", "Electronics", "Block B Room 204", "2026-05-18", "FOUND", "security@univ.edu");
        manager.reportItem("Black Leather Wallet", "Personal Items", "Campus Football Field", "2026-05-19", "LOST", "student99@univ.edu");

        while (true) {
            System.out.println("\n=================================");
            System.out.println(" 🏫 UNIVERSITY LOST & FOUND PORTAL ");
            System.out.println("=================================");
            System.out.println("1. Report a Lost Item");
            System.out.println("2. Report a Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Search for an Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String lName = scanner.nextLine();
                    System.out.print("Enter Category (Electronics/Books/Keys/Cards): ");
                    String lCat = scanner.nextLine();
                    System.out.print("Where did you lose it?: ");
                    String lLoc = scanner.nextLine();
                    System.out.print("Date Lost (YYYY-MM-DD): ");
                    String lDate = scanner.nextLine();
                    System.out.print("Your Contact Email/Phone: ");
                    String lContact = scanner.nextLine();
                    manager.reportItem(lName, lCat, lLoc, lDate, "LOST", lContact);
                    break;
                    
                case 2:
                    System.out.print("Enter Item Name: ");
                    String fName = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String fCat = scanner.nextLine();
                    System.out.print("Where did you find it?: ");
                    String fLoc = scanner.nextLine();
                    System.out.print("Date Found (YYYY-MM-DD): ");
                    String fDate = scanner.nextLine();
                    System.out.print("Your Contact Details: ");
                    String fContact = scanner.nextLine();
                    manager.reportItem(fName, fCat, fLoc, fDate, "FOUND", fContact);
                    break;
                    
                case 3:
                    manager.displayAllItems();
                    break;
                    
                case 4:
                    System.out.print("Enter keyword to search (name or category): ");
                    String keyword = scanner.nextLine();
                    manager.searchItem(keyword);
                    break;
                    
                case 5:
                    System.out.println("\n👋 Exiting Portal. Thank you for keeping our campus honest!");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("❌ Invalid selection. Please type a number between 1 and 5.");
            }
        }
    }
}
