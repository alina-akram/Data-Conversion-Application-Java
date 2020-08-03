package edu.bu.met.cs665;

import org.shaded.apache.bcel.generic.ARRAYLENGTH;

import java.util.ArrayList;

public class CustomerOverUsb implements CustomerData {
    //class for old system
    //supposed to use CustomerDB

    private CustomerDB usbDB;

    public CustomerOverUsb(CustomerDB d){
        //constructer
        usbDB = d; //initializing


    }
    @Override
    public void printCustomer(CustomerId id) {
        //Gets a customer based on ID and prints it
        Customer toPrint =  getCustomer_withUSB(id); //gets based on id / returns a customer //type Customer!
        System.out.println(toPrint);

    }

    @Override
    public Customer getCustomer_withUSB(CustomerId id) {


        //public Customer getViaUsb(CustomerId id){
        Customer getUSB =  usbDB.getViaUsb(id); //db methods need a . operator


        return getUSB;
    }

}
