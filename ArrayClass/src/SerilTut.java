import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerilTut {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		GameApp gameObj= new GameApp();
		gameObj.name="Test Player";
		gameObj.power="Mid";
		gameObj.points=2;
		
		
		
		// writing object in a file
		FileOutputStream fos= new FileOutputStream("game.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(gameObj);
		
		
		
		//reading object from a file
		FileInputStream fis=new FileInputStream("game.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		GameApp appObj= (GameApp)ois.readObject();
		
		System.out.println(appObj.name);
		System.out.println(appObj.testMethod());

	}

}


 // serializable is marker interface ... interface which is empty ....
class GameApp implements Serializable
{
	String name;
	String power;
	int points;
	
	String testMethod()
	{
		return (name+""+power+""+points);
	}
	
	
}