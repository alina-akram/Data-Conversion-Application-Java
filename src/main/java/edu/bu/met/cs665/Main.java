/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {
    //executes methods

    public static void main(String [] args){
        //instance, tostring method
        //inst
        Customer customer1 = new Customer("Alina", new CustomerId(20), "123-456-7889" );
        Customer customer2 = new Customer("Zasha", new CustomerId(21), "213-456-5439" );

        CustomerDB db1 = new CustomerDB(); //db instance /first time we use a variable in different classes we have to use the classname the first time.
        //type before the variable name only means you are declaring the variable. only needed once.
        db1.addCustomer(customer1); //first customer added.
        db1.addCustomer(customer2);

        System.out.println("\nTesting the Old System");
        CustomerOverUsb oldSystem = new CustomerOverUsb(db1); //ini old system
        oldSystem.printCustomer(new CustomerId(20));

        System.out.println("\nTesting the New System");
        CustomerOverHttps newSystem = new CustomerOverHttps(db1);//testcase
        newSystem.printCustomer(new CustomerId(20));


        System.out.println("\nTesting the Adapter");
        CustomerData adapter = new HttpstoUSBAdapter(newSystem); //
        adapter.printCustomer(new CustomerId(20));
        Customer customer3 = adapter.getCustomer_withUSB(new CustomerId(21));
        System.out.println(customer3);


//        System.out.println(customer1);
//        System.out.println(customer2);
    }


}
