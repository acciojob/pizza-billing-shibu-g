package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheese=false;
    private boolean topping=false;
    private boolean billgenerated=true;
    private boolean bag=false;

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
    	bag=true;
    }

    public String getBill(){
    	if(billgenerated) {
    	if(cheese) {
    		price+=80;
        	bill+="Extra Cheese Added: 80\n";
    	}
    	if(topping) {
    		if(isVeg){
       		 price+=70;
       		 bill+="Extra Toppings Added: 70\n";
       		}
       	 else {
       		 price+=120;
       		 bill+="Extra Toppings For Non-veg Pizza: 120\n";
       	 }
    	}
    	if(bag) {
    		price+=20;
    	bill+="Paperbag Added: 20\n";
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
