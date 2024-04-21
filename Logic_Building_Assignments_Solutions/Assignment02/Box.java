class Box{

	int height;
	int width;
        int breadth;
	
	Box(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}

	int getVolume(){

		return height*width*breadth;
	}

		
	int getArea(){

		return 2*(height*width+width*breadth+breadth*height);
	}

	public static void main(String[] args){

		Box b1=new Box(40,30,40);
		System.out.println("Volume is "+b1.getVolume());
		System.out.println("Area is "+b1.getArea());


		Box b2=new Box(50,40,40);
		System.out.println("Volume is "+b2.getVolume());
		System.out.println("Area is "+b2.getArea());
	}
}