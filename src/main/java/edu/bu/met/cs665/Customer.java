package edu.bu.met.cs665;

public class Customer {
    //customer class
    //name, id, customer_phone
    private String name;
    private CustomerId id;
    private String cPhone;


    public Customer(String cname, CustomerId cid, String phone) { // constructer has to be asame as the class name
        name = cname;
        id = cid;
        cPhone = phone;
    }

    public String toString(){
     //stand alone method
        return "name: " + name + "\nid: "+ id + "\ncPhone: " + cPhone;
    }

    public CustomerId get_CustomerID(){
        return id;
    }



}
