package onlineShoping;

//this clas is representing a customer
public class Customer implements  User{
    private String name;

//    constructor
    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
