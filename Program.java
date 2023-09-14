public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        OrderInput orderInput = new OrderInput();
        Order order = orderInput.inputFromConsole();

        OrderJson jsonSerializer = new OrderJson();
        jsonSerializer.saveToJson(order);
    }
}
