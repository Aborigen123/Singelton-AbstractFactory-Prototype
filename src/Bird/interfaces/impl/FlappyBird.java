package Bird.interfaces.impl;

import Bird.interfaces.Bird;
import factory.impl.CreateBirdFactory;

public class FlappyBird implements Bird {

	@Override
	public void create() {
	System.out.println("Bird is created and fly");
		
	}



}
