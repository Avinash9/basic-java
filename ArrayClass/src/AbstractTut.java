



 class Test1
{  
	 

	 
	 void show()
		{
			System.out.println("in show2");
			
		}
	
}




 abstract class Test
{  
	 
	 public Test() {
	System.out.println("000000");
}
	 
	 void show()
		{
			System.out.println("in show2");
			
		}
	
}
public class AbstractTut extends Test {
	
	void show()
	{
		System.out.println("in show1");
		
	}
	
	public static void main(String[] args) {
		
		AbstractTut ob=new AbstractTut();
		ob.show();
		
	}
	

}
