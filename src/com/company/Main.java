package com.company;
//DevoloperDay
public class Main{

	public static  void main(String[] args){

	    Activity activity = new Sleeping();
	    Devoloper devoloper = new Devoloper();

	    devoloper.setActivity(activity);

	   for  (int i = 0; i<9 ; i++){
	     devoloper.justDoIt();
	     devoloper.changeActivity();
        }
    }
}
