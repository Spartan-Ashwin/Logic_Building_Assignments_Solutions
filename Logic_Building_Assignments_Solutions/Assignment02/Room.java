class Room{

	int height;
	int width;	
	int breadth;

	Room(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}

	int volume(){
		
		int volume=height*width*breadth;
		return volume;
	}

	public static void main(String[] args){

		Room room1=new Room(40,50,40);
		System.out.println(room1.volume());
	}
	
}