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

    @Override  // zrobić wersję z podmianą konkretnych parametrów customera i porównać działanie
    public Result updateCustomer(Customer customer) {
        Result result = new Result();
        result.setErrorCode(-1);
        for (Customer customer1 : CustomerDataBase.getCustomerDataBase()) {
                if (customer1.getUuid().equals(customer.getUuid())) {
                    CustomerDataBase.getCustomerDataBase().set
                            (CustomerDataBase.getCustomerDataBase().indexOf(customer1), customer);
                    result.setErrorCode(0);
                    break;
                }
            }
        return result;
    }

    @Override
    public Result updateCustomer2(Customer customer) {
        Result result = new Result();
        result.setErrorCode(-1);
        for (Customer customer1 : CustomerDataBase.getCustomerDataBase()) {
            if (customer1.getUuid().equals(customer.getUuid())) {
                customer1.setBirthDay(customer.getBirthDay());
                customer1.setName(customer.getName());
                customer1.setSurname(customer.getSurname());
                customer1.setSentenceList(customer.getSentenceList());
                customer1.setSex(customer.getSex());
                result.setErrorCode(0);
                break;
            }
        }
        return  result;
    }

    @Override
    public Customer getCustomer(UUID uuid) {
        Customer customer = null;
        for (Customer customer1 : CustomerDataBase.getCustomerDataBase()) {
            if (customer1.getUuid().equals(uuid)) {
                customer = customer1;
            }
            if (customer == null) {
                throw new NullPointerException("Więźnia nie ma w więzieniu");
            }
        }
        return customer;
    }
}
