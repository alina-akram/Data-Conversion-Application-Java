/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */
package edu.bu.met.cs665;
import org.shaded.apache.bcel.generic.ARRAYLENGTH;
import java.util.ArrayList;

public class CustomerOverUsb implements CustomerData {
    //class for old system/uses CustomerDB

    private CustomerDB usbDB;

    public CustomerOverUsb(CustomerDB d){
        //constructor function

        usbDB = d; //initializing
    }

    @Override
    public void printCustomer(CustomerId id) {
        //Gets a customer based on ID and prints it
        Customer toPrint =  getCustomer_withUSB(id);
        System.out.println(toPrint);
    }

    @Override
    public Customer getCustomer_withUSB(CustomerId id) {
        //DB method get old system customer based on id
        Customer getUSB =  usbDB.getViaUsb(id);

        return getUSB;
    }
}
