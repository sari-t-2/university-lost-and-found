public class Item {
    private int id;
    private String name;
    private String category;
    private String location;
    private String date;
    private String status; 
    private String contactInfo;

    
    public Item(int id, String name, String category, String location, String date, String status, String contactInfo) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.location = location;
        this.date = date;
        this.status = status;
        this.contactInfo = contactInfo;
    }

    
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getLocation() { return location; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "[" + status + " ID: " + id + "] " + name + " (" + category + ")\n" +
               "   Location: " + location + " | Date: " + date + "\n" +
               "   Contact: " + contactInfo + "\n-----------------------";
    }
}
