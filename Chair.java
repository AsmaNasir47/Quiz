package ChairSetterGetter;

import java.util.Scanner;

public class Chair {
	
    Scanner s = new Scanner(System.in);
    
    String brand;
	String color;
	double weight;
	double price;
	
    public void setBrand(String brand) {
		 System.out.println("Enter your chair brand : ");
		      this.brand = s.nextLine();
		  }
	 public void setColor(String color) {
		 System.out.println("Enter your chair colour : ");
	          this.color = s.nextLine();
		  }	  
     public void setWeight(double weight) {
    	 System.out.println("Enter your chair weight : ");
	          this.weight = s.nextDouble();
		  }
     public void setPrice(double price) {
    	 System.out.println("Enter your chair price : ");
			  this.price = s.nextDouble();
		  }
		  
	 public String getBrand() {
		  return this.brand;
	  }
	  public String getColor() {
	 	  return this.color;
	  }
	  public double getWeight() {
		  return this.weight;
	  }
	  public double getPrice() {
		  return this.price;
	  }	  
}	  


