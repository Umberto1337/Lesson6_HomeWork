import java.io.FileWriter;
import java.io.IOException;

public class OrderJson {

    public void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            String json = toJson(order);
            writer.write(json);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String toJson(Order order) {
        // Создаём JSON-представление заказа и возвращаем его в виде строки
        return "{\n" +
                "\"clientName\":\""+ order.getClientName() + "\",\n" +
                "\"product\":\""+order.getProduct()+"\",\n" +
                "\"qnt\":"+order.getQnt()+",\n" +
                "\"price\":"+order.getPrice()+"\n" +
                "}\n";
    }
}
