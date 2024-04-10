import java.util.ArrayList;
public class GroceryList {
    private ArrayList<GroceryItemOrder> itemList;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        this.itemList = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (itemList.size() < MAX_ITEMS) {
            itemList.add(item);
        } else {
            System.out.println("Grocery list is full. Cannot add more items.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (GroceryItemOrder item : itemList) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    // Method to safely access the itemList
    public ArrayList<GroceryItemOrder> getItemList() {
        return itemList;
    }

    public static void main(String[] args) {
        // Example usage
        GroceryList list = new GroceryList();

        // Adding items to the list
        list.add(new GroceryItemOrder("Cookies", 2.30));
        list.add(new GroceryItemOrder("Milk", 1.50));
        list.add(new GroceryItemOrder("Bread", 1.80));

        // Setting quantities for items
        list.getItemList().get(0).setQuantity(4); // Cookies
        list.getItemList().get(1).setQuantity(2); // Milk
        list.getItemList().get(2).setQuantity(1); // Bread

        // Getting total cost
        double totalCost = list.getTotalCost();
        System.out.println("Total Cost: $" + totalCost);
    }
}