class Vehicle{

	int price;
	String color;
	String model;
		
	Vehicle(int price,String color,String model){

		this.price=price;
		this.color=color;
		this.model=model;
	}

	void display(){

		System.out.println("Vehicle model no. is "+model);
		System.out.println("Vehicle color is "+color);
		System.out.println("Vehicle price is "+price);
	}

	public static void main(String[] args){

		Vehicle v1=new Vehicle(300000,"red","swift102");
		v1.display();
	}

}