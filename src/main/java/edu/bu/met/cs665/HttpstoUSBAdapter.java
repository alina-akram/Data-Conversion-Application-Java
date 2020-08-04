/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */

package edu.bu.met.cs665;

public class HttpstoUSBAdapter implements CustomerData {
    //Adapter class allows us to use old API
    //"Https to USB" Adapter takes in the old system translates to https

    CustomerOverHttps newSystem;

    public HttpstoUSBAdapter(CustomerOverHttps customer){
        //constructor function
        newSystem = customer;
    }

    @Override
    public void printCustomer(CustomerId id){
        //displays customer captured by Id
        newSystem.printCustomer(id);
    }

    @Override
    public Customer getCustomer_withUSB(CustomerId id){
        //
        return newSystem.getCustomer_withHttps(id);

    }
}
