package dao;

import dataBase.CustomerDataBase;
import model.Customer;
import model.Result;

import java.util.List;
import java.util.UUID;

public class CustomerDaoImpl implements ICustomerDao {
    @Override
    public List<Customer> getAllCustomer() {
        return CustomerDataBase.getCustomerDataBase();
    }
    @Override
    public Result addCustomer(Customer customer) {
        Result result = new Result();
        if (!CustomerDataBase.getCustomerDataBase().contains(customer)) {
            CustomerDataBase.getCustomerDataBase().add(customer);
            result.setErrorCode(0);
        }
        else {
            result.setErrorCode(-1);
            result.setErrorDescription("Więzień istnieje");
        }
        return result;
    }
    @Override
    public Result removeCustomer(Customer customer) {
        Result result = new Result();
        if ( CustomerDataBase.getCustomerDataBase().contains(customer)) {
            CustomerDataBase.getCustomerDataBase().remove(customer);
            result.setErrorCode(0);
        }
        else {
            result.setErrorCode(-1);
            result.setErrorDescription("Więźnia nie ma w więzieniu.");
        }
        return result;
    }

    @Override
    public Result updateCustomer(Customer customer) {
        Result result = new Result();
        for (Customer customer1 : CustomerDataBase.getCustomerDataBase()) {
                if (customer1.getUuid() == customer.getUuid()) {
                    CustomerDataBase.getCustomerDataBase().remove(customer1);
                    CustomerDataBase.getCustomerDataBase().add(customer);
                    result.setErrorCode(0);
                } else {
                    result.setErrorCode(-1);
                    result.setErrorDescription("Nie ma wieźnia do podmianki");
                }
            }
        return result;
    }

    @Override
    public Customer getCustomer(UUID uuid) {
        return null;
    }
}
