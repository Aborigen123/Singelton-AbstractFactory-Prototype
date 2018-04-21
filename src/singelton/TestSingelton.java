package singelton;

import Bird.interfaces.Bird;
import Bird.interfaces.impl.FlappyBird;
import factory.interfaces.BirdFactory;

public class TestSingelton  {

	public static  TestSingelton instance;

	
	public static  TestSingelton getInstance() {
		if(instance == null) {
			instance = new TestSingelton();
		}
		return instance;
	}
	private TestSingelton() {
		
	}
	
	public void print() {
		System.out.println("bird create simple");
	}
	
}
