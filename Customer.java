package Task1;

public class Customer {

    private String firstName;

    private String lastName;

    private String userName;

    private int id;

    private static int counter = 0;

    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        counter++;
        this.id = counter;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUserName(){
        return userName;
    }

    public int getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String toString(){
        return "First name: " + getFirstName() + ", Last name: " + getLastName() + ", Username: " + getUserName() + ", ID: " + getId();
    }





}
