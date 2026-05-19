import java.util.ArrayList;

public class PortalManager {
    private ArrayList<Item> itemDatabase = new ArrayList<>();
    private int idCounter = 1;

    public void reportItem(String name, String category, String location, String date, String status, String contactInfo) {
        Item newItem = new Item(idCounter++, name, category, location, date, status, contactInfo);
        itemDatabase.add(newItem);
        System.out.println("\n🎉 Item reported successfully! Assigned ID: " + newItem.getId());
    }

    
    public void displayAllItems() {
        if (itemDatabase.isEmpty()) {
            System.out.println("\n📭 No items reported yet.");
            return;
        }
        System.out.println("\n=== CAMPUS LOST & FOUND DATABASE ===");
        for (Item item : itemDatabase) {
            System.out.println(item);
        }
    }

    public void searchItem(String keyword) {
        boolean found = false;
        System.out.println("\n🔎 Search Results for '" + keyword + "':");
        for (Item item : itemDatabase) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase()) || 
                item.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No matching items found.");
        }
    }
}
