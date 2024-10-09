package Task1;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Jeppe Høst", "Thomsen", "JeppeHost");
        Customer customer2 = new Customer("Ulla", "Høst", "UllaHost");
        Customer customer3 = new Customer("Esben Riis", "Thomsen", "EsbenRiis");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        printCustomers(customers);
    }

        public static void printCustomers(ArrayList <Customer> customers){
            for(Customer customer : customers){
                System.out.println(customer);
            }

        }


    }
