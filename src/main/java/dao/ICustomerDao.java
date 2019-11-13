package dao;

import model.Customer;
import model.Result;

import java.util.List;
import java.util.UUID;

public interface ICustomerDao {

    List<Customer> getAllCustomer();
    Result addCustomer(Customer customer);
    Result removeCustomer(UUID uuid);
    Result updateCustomer (Customer customer);


}
