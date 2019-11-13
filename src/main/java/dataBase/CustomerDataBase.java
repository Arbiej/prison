package dataBase;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataBase {
    private static List<Customer> customerDataBase = new ArrayList<>();


    public static List<Customer> getCustomerDataBase() { return  customerDataBase;}
}
