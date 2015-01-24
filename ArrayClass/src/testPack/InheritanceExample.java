package testPack;

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
//	b=309;
	void display3(){
		System.out.println(b);
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
