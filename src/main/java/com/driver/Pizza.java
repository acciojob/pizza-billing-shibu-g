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
        price+=300;	
        bill="Base Price Of The Pizza: 300\n";
        }else {
        	price+=400;
        	 bill="Base Price Of The Pizza: 400\n";
        }
       
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	if(!cheese) {
    		price+=80;
    	}
    	cheese=true;
    }

    public void addExtraToppings(){
    	if(!topping&&isVeg){
    		price+=70;
    	}
    	if(!topping&&!isVeg) {
    		price+=120;
    	}
    	topping=true;
    }

    public void addTakeaway(){
        // your code goes here
    	if(!bag) {
    		price+=20;
    	}
    	bag=true;
    }

    public String getBill(){
    	if(billgenerated) {
    	if(cheese) {
        	bill+="Extra Cheese Added: 80\n";
    	}
    	if(topping) {
    		if(isVeg){
       		 bill+="Extra Toppings Added: 70\n";
       		}
       	 else {
       		 bill+="Extra Toppings Added: 120\n";
       	 }
    	}
    	if(bag) {
    	bill+="Paperbag Added: 20\n";
    	}
        // your code goes here
    	bill+="Total Price: "+price+"\n";
    	billgenerated=false;
        return this.bill;
    }
    
    		return this.bill;
    	
    }
}
