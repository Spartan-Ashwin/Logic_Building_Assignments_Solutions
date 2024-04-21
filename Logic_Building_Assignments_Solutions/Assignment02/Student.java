class Student{

	String name;
	double sub1,sub2,sub3;

	void assignValues(String name,double sub1,double sub2,double sub3){
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}

	double findSum(){
		
		return sub1+sub2+sub3;
	}

	double findAvg(){
		double sum=findSum();
		double avg=sum/3.0;
		return avg;
	}

        void printNameAndSum(){
		
		System.out.println("Name is "+name+" and sum of marks is "+findSum());
	}

	public static void main(String[] args){

		Student s1=new Student();
		s1.assignValues("Ashwin",44,66,88);
		System.out.println("Average marks = "+s1.findAvg());
		s1.printNameAndSum();

		
	}
}