
class TestArray{
	
	void test(){
		System.out.println("aa");
	}
}


public class ArrayTut {

	/**
	 * @param args
	 */
	
	private int array[]= new int[5];  //memory allocation at run time
	
	private int twoDArray[][] =new int[2][3];
	private int twoDArray1[][]= {{1,2},{1,2,3},{4,5,6,7,8}};
//	
//	private int [] array1= new int[5]; // second way
//	
//	private TestArray objArray[] = new TestArray[5];	
//	
	public static void main(String[] args) {
		
		ArrayTut ob=new ArrayTut();
		ob.array[0]=1;
		ob.array[1]=2;
//		System.out.println(ob.array[1]);
		// TODO Auto-generated method stub
//		System.out.println(ob.array.length);
		
		ob.twoDArray[0][0]=1;
//		System.out.println(ob.twoDArray[0].length);
		
//		System.out.println(ob.twoDArray);
//		
//		System.out.println(ob.twoDArray1[0].length);
//		System.out.println(ob.twoDArray1[1].length);
//		System.out.println(ob.twoDArray1[2].length);
		
//		TestArray testobj=new TestArray();
//		ob.objArray[0]=testobj;
		
		System.out.println(ob.twoDArray.length);

	}

}
