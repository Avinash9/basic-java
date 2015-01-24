class First
{
	public First() {
		System.out.println("in first cons");
	}
	public First(int a,int b)
	{
		this();
		System.out.println(":in first param cons");
		
	}
//	protected void display()
//	{
//		System.out.println("in first display");
//	}
}

class Second extends First
{
	
	public Second() {
		
		super(10,20);
		System.out.println("in second cons");
		
	}
	void show()
	{
		System.out.println("in second show");
	}
//	public void display()
//	{
//		System.out.println("in second display");
//	}
}
public class InheriConsTut {
	public static void main(String[] args) {
		Second second= new Second();
//		second.display();
	}

}
