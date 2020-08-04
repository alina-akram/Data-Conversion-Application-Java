/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */
package edu.bu.met.cs665;

import java.util.ArrayList;

public class CustomerDB {
    //One common database both systems will interact with (O/N)/contains all customers

    private ArrayList<Customer> customerList;

    public CustomerDB(){
        //function for the list
        customerList = new ArrayList<Customer>(); // list inst
    }

    public void addCustomer(Customer c){
        //function to add a customer instance
        customerList.add(c);
    }

    public Customer getViaUsb(CustomerId id){
        //checks existence of customer in the db via id and returns it (old system)
        System.out.println("Getting Customer Data via USB....");

        for(Customer c: customerList){
            if (c.get_CustomerID().get_Id() == id.get_Id()) {
                return c;
            }
        }
        return null;
    }

    public Customer getViaHttps(CustomerId id){
        //checks existence of customer in the db via id and returns it (new system)
        System.out.println("Getting Customer Data via Https....");
        for(Customer c: customerList){
            if (c.get_CustomerID().get_Id() == id.get_Id()) { //our get method
                return c;
            }
        }
        return null;
    }
}
