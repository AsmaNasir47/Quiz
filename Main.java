package ChairSetterGetter;

import BicycleSetterGetter.Bicycle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chair x = new Chair();
		x.getBrand();
		x.getColor();
		x.getPrice();
		x.getWeight();
		
		System.out.println("Brand : " + x.getBrand());
		System.out.println("Colour : " + x.getColor());
		System.out.println("Weight : " + x.getWeight());
		System.out.println("Price : " + x.getPrice());
		
	}

}
