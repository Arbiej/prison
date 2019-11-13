import dao.CustomerDaoImpl;
import dao.ICustomerDao;
import model.Customer;
import model.Sentence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Krzysztof");
        customer.setSurname("Kowalski");
        customer.setSex(true);
        LocalDate customerB = LocalDate.of(1990, 2, 22);
        LocalDate customerStart = LocalDate.of(2019, 2, 22);
        LocalDate customerStop = LocalDate.of(2020, 2, 22);
        customer.setBirthDay(customerB);
        Sentence sentence = new Sentence();
        sentence.setStart(customerStart);
        sentence.setStop(customerStop);
        sentence.setParole(true);
        sentence.setDescription("napad na bank");
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence);
        customer.setSentenceList(sentences);

        ICustomerDao customerDao = new CustomerDaoImpl();
        customerDao.addCustomer(customer);
        List<Customer> customerList = customerDao.getAllCustomer();
        System.out.println(customerList.size());
        System.out.println(customerList.toString());



    }
}
