class Person{

	int age;
        double height;
	int weight;
	
	Person(){}

	Person(int age,double height,int weight){
		
		this.age=age;
		this.height=height;
		this.weight=weight;
	}


	void display(){

		System.out.println("Person age is "+age+" and height is "+height+" weight is "+weight);
	}


	public static void main(String[] args){

		Person p1=new Person(25,5.6,60);
		p1.display();

		Person p2=new Person(26,5.6,70);
		p2.display();
	}
	
}