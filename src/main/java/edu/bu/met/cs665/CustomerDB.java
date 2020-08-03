package edu.bu.met.cs665;

import java.util.ArrayList;

public class CustomerDB {
    //One common database both systems will interact with (O/N)
    //contains all customers
    private ArrayList<Customer> customerList;

    public CustomerDB(){
        //for the list - wrapper(restricts functionality in this situation) -
        customerList = new ArrayList<Customer>(); // list inst


    }

    public void addCustomer(Customer c){
        //adding customer instance
        customerList.add(c);

    }

    public Customer getViaUsb(CustomerId id){
        System.out.println("Getting Customer Data via USB....");
        //checks exitence of customer in the db via id and returns it
        //1 index

        //for (type i in array : i <
        //if instid == i[1]:
        //return i
        //else: i++
        for(Customer c: customerList){
            if (c.get_CustomerID().get_Id() == id.get_Id()) { //our get method
                return c;
            }
        }
        return null;

    }

    public Customer getViaHttps(CustomerId id){
        System.out.println("Getting Customer Data via Https....");
        for(Customer c: customerList){
            if (c.get_CustomerID().get_Id() == id.get_Id()) { //our get method
                return c;
            }
        }

        return null;

    }


}
