public class Inventory {

    private String itemName;
    private int quantity;
    private double price;

    // constructors

    public Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // getters

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // setters

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // methods

    public String toString() {
        return "Item: " + itemName
                + ", Quantity: " + quantity
                + ", Price: $" + price;
    }

    public boolean equals(Inventory other) {
        if (this.itemName.equals(other.itemName)
                && this.quantity == other.quantity
                && this.price == other.price) {
            return true;
        }
        return false;
    }

    public double raisePrice(double percentage) {
        price = price + (price * (percentage / 100));
        return price;
    }

}
