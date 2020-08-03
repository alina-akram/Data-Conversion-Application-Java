package edu.bu.met.cs665;

public class HttpstoUSBAdapter implements CustomerData {
    //adapter class new system can access old system /Adapter class allows us to use old API
    //U-A takes in the old system translates to https

    CustomerOverHttps newSystem;


    public HttpstoUSBAdapter(CustomerOverHttps customer){
        //constructer
        newSystem = customer;
    }

    @Override
    public void printCustomer(CustomerId id){
        newSystem.printCustomer(id);
    }

    @Override
    public Customer getCustomer_withUSB(CustomerId id){
        return newSystem.getCustomer_withHttps(id);

    }



}
