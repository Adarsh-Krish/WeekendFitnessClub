import com.example.wfc.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Weekend Fitness Club!");

        Customer customer1 = new Customer("John Smith", "john@gmail.com");
        Customer customer2 = new Customer("Sarah Johnson", "sarah@gmail.com");
        Customer customer3 = new Customer("Mark Davis", "mark@gmail.com");
        Customer customer4 = new Customer("Emily Brown", "emily@gmail.com");
        Customer customer5 = new Customer("David Lee", "david@gmail.com");

        customer1.viewCustomer();
        customer2.viewCustomer();
        customer3.viewCustomer();
        customer4.viewCustomer();
        customer5.viewCustomer();
    }
}