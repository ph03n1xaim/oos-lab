import java.util.*;


class Item {
    int id;
    String name;
    int unitPrice;

    Item(int id, String name, int unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int unitPrice() {
        return this.unitPrice;
    }

}


class Inventory {
    List<Item> items = new ArrayList<>();

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] dataRow;
        Item currItem;
        int currId;
        String currName;
        int currUnitPrice;

        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equals("OKAY"))
                break;

            dataRow = input.split(" ");
            if (dataRow.length > 3)
                System.exit(1);

            currId = Integer.parseInt(dataRow[0]);
            currName = dataRow[1];
            currUnitPrice = Integer.parseInt(dataRow[2]);
            currItem = new Item(currId, currName, currUnitPrice);
            this.items.add(currItem);
        }


    }

    public Item findItem(int id) {
        for (Item item: this.items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


}


class InvoiceItem {
    Item item;
    int quantity;

    InvoiceItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return this.item;
    }

    public int getQuantity() {
        return this.quantity;
    }
}


class Invoice {
    List<InvoiceItem> invoiceItems = new ArrayList<>();

    public void addInvoice(Inventory inventory) {
        char choice;
        String input;
        String[] dataRow;
        int currId;
        int currQuantity;
        Item currItem;
        InvoiceItem currInvoiceItem;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Add Invoice Item(Y/N)");
        choice = scanner.nextLine().trim().charAt(0);
        if (choice != 'Y')
            return;

        System.out.println("Enter the Inventory ID and Quantity line by line, type OKAY at the end of the list");
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equals("OKAY"))
                break;

            dataRow = input.split(" ");
            if (dataRow.length != 2)
                System.exit(1);

            currId = Integer.parseInt(dataRow[0]);

            currItem = inventory.findItem(currId);
            if (currItem == null)
                System.exit(1);

            currQuantity = Integer.parseInt(dataRow[1]);
            currInvoiceItem = new InvoiceItem(currItem, currQuantity);

            this.invoiceItems.add(currInvoiceItem);
        }
    }


    public void printInvoice() {
        int sum = 0;
        System.out.println("****INVOICE****");
        for (InvoiceItem invItem: this.invoiceItems) {
            System.out.println( invItem.item.id + "," + invItem.item.name + "," + invItem.item.unitPrice + "," + invItem.quantity);
            sum += invItem.item.unitPrice * invItem.quantity;
        }
        System.out.println("Total:" + sum);
        System.out.println("********");
    }
}


public class Q2 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Invoice invoice = new Invoice();
        
        inventory.initialize();

        while (true) {    
            switch (getUserInput()) {
                case 1:
                    invoice.addInvoice(inventory);
                    invoice.printInvoice();
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }

    static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("");
        System.out.println("1.Add Invoice");
        System.out.println("2.Exit");
        System.out.println("Choice:");
        choice = Integer.parseInt(scanner.nextLine().trim());
        return choice;
    }

}
