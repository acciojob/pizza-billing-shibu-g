package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheese=false;
    private boolean topping=false;
    private boolean billgenerated=true;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
        price=300;	
        bill="Base Price Of The Pizza: 300\n";
        }else {
        	price=400;
        	 bill="Base Price Of The Pizza: 400\n";
        }
       
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	cheese=true;
    }

    public void addExtraToppings(){
    	topping=true;
    }

    public void addTakeaway(){
        // your code goes here
    	if(bill.contains("bag"))return;
    	else{
    		price+=20;
    	bill+="Paper bag Price = 20\n";
    	}
    }

    public String getBill(){
    	if(billgenerated) {
    	if(cheese) {
    		price+=80;
        	bill+="Extra Cheese Price = 80\n";
    	}
    	if(topping) {
    		if(isVeg){
       		 price+=70;
       		 bill+="Extra Toppings For Veg Pizza = 70\n";
       		}
       	 else {
       		 price+=120;
       		 bill+="Extra Toppings For Non-veg Pizza = 120\n";
       	 }
    	}
        // your code goes here
    	bill+="Total Price: "+price+"\n";
    	billgenerated=false;
        return this.bill;
    }
    	else{
    		return "";
    	}
    }
}
