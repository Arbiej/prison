package service;

import model.Customer;
import model.PrisonCell;
import model.Result;

import java.util.List;

public interface IPrisonCellService {
    List<PrisonCell> getAllCells();
    Result putCustomer(Customer customer, int cellId);
    List<Customer> getCustomerDataBase();

}
