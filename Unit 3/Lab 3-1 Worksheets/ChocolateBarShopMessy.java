public class ChocolateBarShopMessy {

    private String[] barTypes;
    private String[] barPrices; // just labels, no price math
    private int[] inventory;

    public ChocolateBarShopMessy() {
        barTypes = new String[] {
                "MILK_SMALL",
                "MILK_LARGE",
                "DARK_ALMOND",
                "WHITE_COOKIE"
        };

        barPrices = new String[] {
                "1.50",
                "2.50",
                "2.00",
                "2.25"
        };

        inventory = new int[] {
                50,
                40,
                30,
                20
        };
    }

    // Repeats display-name logic (also used in other methods).
    public void printInventory() {
        for (int i = 0; i < barTypes.length; i++) {
            String type = barTypes[i];
            String priceLabel = barPrices[i];
            int stock = inventory[i];

            String displayName;
            if (type.equals("MILK_SMALL")) {
                displayName = "Milk Chocolate (Small)";
            } else if (type.equals("MILK_LARGE")) {
                displayName = "Milk Chocolate (Large)";
            } else if (type.equals("DARK_ALMOND")) {
                displayName = "Dark Chocolate with Almonds";
            } else if (type.equals("WHITE_COOKIE")) {
                displayName = "White Chocolate with Cookie Bits";
            } else {
                displayName = type;
            }

            System.out.println(
                    "[Inventory] " + displayName +
                            " | stock: " + stock +
                            " | price label: $" + priceLabel);
        }
    }

    /**
     * This method is doing THREE different things:
     * 1) Finding the bar and validating the order (type + quantity + stock).
     * 2) Updating the inventory.
     * 3) Printing a confirmation message (repeats display-name logic).
     */
    public void processOrder(String barType, int quantity) {
        // (1) Find the bar index + validation
        int index = -1;
        for (int i = 0; i < barTypes.length; i++) {
            if (barTypes[i].equals(barType)) {
                index = i;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("Unknown chocolate bar type: " + barType);
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        int currentStock = inventory[index];
        if (currentStock < quantity) {
            throw new IllegalStateException(
                    "Not enough stock. Requested: " + quantity +
                            ", available: " + currentStock);
        }

        // (2) Update inventory
        inventory[index] = currentStock - quantity;

        // (3) Print confirmation (repeats display-name logic)
        String displayName;
        if (barType.equals("MILK_SMALL")) {
            displayName = "Milk Chocolate (Small)";
        } else if (barType.equals("MILK_LARGE")) {
            displayName = "Milk Chocolate (Large)";
        } else if (barType.equals("DARK_ALMOND")) {
            displayName = "Dark Chocolate with Almonds";
        } else if (barType.equals("WHITE_COOKIE")) {
            displayName = "White Chocolate with Cookie Bits";
        } else {
            displayName = barType;
        }

        String priceLabel = barPrices[index];

        System.out.println(
                "[Order] " + quantity + " x " + displayName +
                        " | price label: $" + priceLabel +
                        " | remaining stock: " + inventory[index]);
    }

    // More repetition: search + display-name logic again.
    public void restock(String barType, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Restock amount must be positive");
        }

        int index = -1;
        for (int i = 0; i < barTypes.length; i++) {
            if (barTypes[i].equals(barType)) {
                index = i;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("Unknown chocolate bar type: " + barType);
        }

        inventory[index] = inventory[index] + amount;

        String displayName;
        if (barType.equals("MILK_SMALL")) {
            displayName = "Milk Chocolate (Small)";
        } else if (barType.equals("MILK_LARGE")) {
            displayName = "Milk Chocolate (Large)";
        } else if (barType.equals("DARK_ALMOND")) {
            displayName = "Dark Chocolate with Almonds";
        } else if (barType.equals("WHITE_COOKIE")) {
            displayName = "White Chocolate with Cookie Bits";
        } else {
            displayName = barType;
        }

        System.out.println(
                "[Restock] " + displayName +
                        " | added: " + amount +
                        " | new stock: " + inventory[index]);
    }
}
