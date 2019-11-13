import model.Customer;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        Customer customer = new Customer();
        System.out.println(uuid.toString());

    }
}
