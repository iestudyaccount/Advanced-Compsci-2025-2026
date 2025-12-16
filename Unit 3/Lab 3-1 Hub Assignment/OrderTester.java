public class OrderTester {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Item("Notebook", 3.50, 4),
                new Item("Backpack", 59.99, 1),
                new Item("Pencil", 0.99, 10),
                new Item("Calculator", 79.95, 1)
        };

        Item[] justOne = new Item[] {
                new Item("Eraser", 1.00, 1),
                new Item("Lunchbox", 10, 1),
                new Item("Rolling Backpack", 100, 1)
        };

        double taxRate = 0.09; // 9% tax

        OrderSummary summary = OrderProcessor.processCustomerOrder(items, taxRate);

        System.out.println("--- Order Summary ---");
        System.out.println("Subtotal: $" + summary.getSubtotal());
        System.out.println("Tax: $" + summary.getTax());
        System.out.println("Total: $" + summary.getTotal());

        String[] premium = summary.getExpensiveItems();
        System.out.println("Premium items (" + premium.length + "):");
        for (int i = 0; i < premium.length; i++) {
            System.out.println("- " + premium[i]);
        }

        OrderSummary summary2 = OrderProcessor.processCustomerOrder(justOne, taxRate);

        System.out.println("--- Order Summary ---");
        System.out.println("Subtotal: $" + summary2.getSubtotal());
        System.out.println("Tax: $" + summary2.getTax());
        System.out.println("Total: $" + summary2.getTotal());

        String[] premium2 = summary2.getExpensiveItems();
        System.out.println("Premium items (" + premium2.length + "):");
        for (int i = 0; i < premium2.length; i++) {
            System.out.println("- " + premium2[i]);
        }
    }
}
