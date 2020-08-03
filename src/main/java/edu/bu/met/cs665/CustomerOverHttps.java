package edu.bu.met.cs665;

public class CustomerOverHttps implements CustomerDataOverHttps {

    private CustomerDB httpsDB;

    public CustomerOverHttps(CustomerDB h){
        //constructer
        httpsDB = h; //initializing

    }

    @Override
    public void printCustomer(CustomerId id) {
        Customer toPrint =  getCustomer_withHttps(id); //gets based on id / returns a customer //type Customer!
        System.out.println(toPrint);

    }

    @Override
    public Customer getCustomer_withHttps(CustomerId id) {


        //public Customer getViaUsb(CustomerId id){
        Customer getHttps =  httpsDB.getViaHttps(id); //db methods need a . operator

        return getHttps;
    }

}
