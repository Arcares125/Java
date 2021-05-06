
public abstract class Plant {

	private String name;
	private Integer growTime;
	
	public Plant() {
		// TODO Auto-generated constructor stub
	}
	
	public Plant(String name, Integer growTime) {
		super();
		this.name = name;
		this.growTime = growTime;
	}
	
	abstract void grow();
	

	//overload = parameter beda, susunan parameter
	public void information() {
		System.out.println("Plant Information");
	}
	
	public void information(int growTime) {
		System.out.println("Plant grow in "+growTime+" day");
	}
	
	public void information(String name, int growTime) {
		System.out.println(name+" grow in "+growTime+" day");
	}
	
	public void information( int growTime, String name) {
		System.out.println(name+" grow in "+growTime+" day");
	}

}
