package edu.bu.met.cs665;

public class CustomerId {
    //id
    private int customerId; //dec

    CustomerId(int cId){
        //consturctor

        customerId = cId;
    }

    public int get_Id(){
        return customerId;
    }

    public void set_Id(int cId){
        customerId = cId;

    }

    public String toString(){ //STR()
        //stand alone method
        return "" + customerId;
    }

}
