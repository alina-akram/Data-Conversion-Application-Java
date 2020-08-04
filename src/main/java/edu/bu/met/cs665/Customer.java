/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */

package edu.bu.met.cs665;

public class Customer {
    //Customer class and it's attributes
    private String name;
    private CustomerId id;
    private String cPhone;


    public Customer(String cname, CustomerId cid, String phone) {
        //Constructor function for Customer class
        name = cname;
        id = cid;
        cPhone = phone;
    }

    public String toString(){
     //stand alone method
        return "name: " + name + "\nid: "+ id + "\ncPhone: " + cPhone;
    }

    public CustomerId get_CustomerID(){
        //Access customer Id
        return id;
    }

}
