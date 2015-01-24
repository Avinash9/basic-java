
public class Pen {
	
	String name;
	String type;
	
	
	
	
	public Pen() {
		// TODO Auto-generated constructor stub
		
		System.out.println("in cons!!!!!");
	}
	
	
	public Pen(int a) {
		// TODO Auto-generated constructor stub
		
		this();
		
		System.out.println("in cons22222!!!!!");
	}

	
	
	static
	{
		System.out.println("in static!!!!!!");
	}
	
	void testPen()
	{
		System.out.println("name ::::"+name);
		System.out.println("type::::"+type);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen p1 = new Pen(10);
		p1.name="testpen";
		
		p1.testPen();

	}

}
