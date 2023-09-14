import java.util.Scanner;

public class OrderInput {

    public Order inputFromConsole() {
        Scanner in = new Scanner(System.in);
        String clientName = prompt(in, "Client name: ");
        String product = prompt(in, "Product: ");
        int qnt = Integer.parseInt(prompt(in, "Quantity: "));
        int price = Integer.parseInt(prompt(in, "Price: "));
        in.close();
        return new Order(clientName, product, qnt, price);
    }

    private String prompt(Scanner in, String message) {
        System.out.print(message);
        return in.nextLine();
    }
}
