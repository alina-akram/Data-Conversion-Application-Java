/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */
package edu.bu.met.cs665;

public class CustomerOverHttps implements CustomerDataOverHttps {

    private CustomerDB httpsDB;

    public CustomerOverHttps(CustomerDB h){
        //constructor function
        httpsDB = h; //initializing
    }

    @Override
    public void printCustomer(CustomerId id) {
        //Gets a customer based on ID and prints it
        Customer toPrint =  getCustomer_withHttps(id);
        System.out.println(toPrint);

    }

    @Override
    public Customer getCustomer_withHttps(CustomerId id) {
        //DB method get old system customer based on id
        Customer getHttps =  httpsDB.getViaHttps(id);
        return getHttps;
    }
}
