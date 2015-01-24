
public class OverLoadingTut {

	/**
	 * @param args
	 */
	
	
	int test(int a , int b)
	{
		
		return 1;
	}
	
	int test(int a,float b)
	{
		return 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadingTut ob = new OverLoadingTut();
		System.out.println(ob.test(10, 20.0f));

		System.out.println(ob.test(10,20));
	}

}
