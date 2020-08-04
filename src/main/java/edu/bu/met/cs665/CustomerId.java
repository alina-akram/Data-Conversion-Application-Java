/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #4
 * Aug 3, 2020
 */

package edu.bu.met.cs665;

public class CustomerId {
    //Customer Id Class

    private int customerId;

    CustomerId(int cId){
        //constructor function for class

        customerId = cId;
    }

    public int get_Id(){
        //getter for CustomerID
        return customerId;
    }

    public void set_Id(int cId){
        //setter for Id
        customerId = cId;

    }

    public String toString(){
        //stand alone method to convert to string
        return "" + customerId;
    }
}
