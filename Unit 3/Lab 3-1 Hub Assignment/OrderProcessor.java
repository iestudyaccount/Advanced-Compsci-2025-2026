public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {

        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        String name = getItemName(items, 0);
        double price = getItemPrice(items, 0);
        int quantity = getItemQuantities(items, 0);

        // Calculate item total
        double itemTotal = calcItemTotal(items);
        subtotal = updateSubtotal(itemTotal, subtotal);

        // Check if expensive
        premiumCount = countAllPremiums(items);
        expensiveItemsTemp = getExpensiveItemsNames(items, premiumCount);

        // Trim premium items to exact size
        String[] expensiveItems = trimPremiums(premiumCount, expensiveItemsTemp);

        // Calculate tax and price total
        double tax = calcTax(subtotal, taxRate);
        double total = calcTotal(subtotal, taxRate);

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    // Broke down each individual item getter into its own method as since they were
    // all different types, they could not be returned at the same time.

    public static String getItemName(Item[] items, int itemPlace) {
        String name = items[itemPlace].getName();
        return name;
    }

    public static double getItemPrice(Item[] items, int itemPlace) {
        double price = items[itemPlace].getPrice();
        return price;

    }

    public static int getItemQuantities(Item[] items, int itemPlace) {
        int quantity = items[itemPlace].getQuantity();
        return quantity;
    }

    // Turned calcItemTotal + updateSubtotal into 2 methods since could not return 2
    // doubles at the same time, even if they are the same class

    public static double calcItemTotal(Item[] items) {
        double itemTotal = 0;
        for (Item item : items) {
            itemTotal += item.getPrice() * item.getQuantity();
        }
        return itemTotal;
    }

    public static double updateSubtotal(double itemTotal, double subtotal) {
        subtotal += itemTotal;
        return subtotal;
    }

    public static int countAllPremiums(Item[] items) {
        int premiumCount = 0;
        for (Item item : items) {
            if (item.getPrice() > 50.0) {
                premiumCount += 1;
            }
        }
        return premiumCount;
    }

    public static String[] getExpensiveItemsNames(Item[] items, int premiumCount) {
        String[] expensiveItemsTemp = new String[premiumCount];
        int countExpensiveSoFar = 0;
        for (int i = 0; i < items.length; i++) {
            if (getItemPrice(items, i) > 50.0) {
                String name = getItemName(items, i);
                expensiveItemsTemp[countExpensiveSoFar] = name;
                countExpensiveSoFar++;
                System.out.println(name + " is a premium item at $" + getItemPrice(items, i));
            } else {
                String name = getItemName(items, i);
                System.out.println(name + " is a regular item at $" + getItemPrice(items, i));
            }
        }

        return expensiveItemsTemp;
    }

    public static String[] trimPremiums(int premiumCount, String[] expensiveItemsTemp) {
        System.out.println(premiumCount);
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
            System.out.println(expensiveItems[i]);
        }
        return expensiveItems;
    }

    // Broke down calcTax and calcTotal into 2 separate methods because
    // you cannot return 2 separate doubles without operating on them.

    public static double calcTax(double subtotal, double taxRate) {
        double tax;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            System.out.println(tax);
        } else {
            tax = 0;
            System.out.println(tax);
        }
        return tax;
    }

    public static double calcTotal(double subtotal, double taxRate) {
        double total;
        double tax = calcTax(subtotal, taxRate);
        if (subtotal > 0) {
            total = subtotal + tax;
            System.out.println(total);
        } else {
            total = 0;
            System.out.println(total);
        }
        return total;
    }
}
