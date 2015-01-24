

class Class1{
	
	protected int a=10;
	int b=100;
}


class Class2 extends Class1
{
	
	void display()
	{
		System.out.println(a+ ""+b);
	}
	
	}

class Class3 extends Class2
{
	void display1()
	{
		System.out.println(a+""+b);
	}
	
}

class Class4
{
	void display3(){
		
	}
	}

public class InheritanceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
